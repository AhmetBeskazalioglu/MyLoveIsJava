package designpatterns.builder.person;

public class finalDeneme {
    private final String name;
    private final String surname;

    public finalDeneme(NufusIdaresi builder) {
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static class NufusIdaresi {
        private String name;
        private String surname;

        public NufusIdaresi() {
        }

        public NufusIdaresi(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public NufusIdaresi setName(String name) {
            this.name = name;
            return this;
        }

        public NufusIdaresi setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public finalDeneme build() {
            return new finalDeneme(this);
        }
    }

    public static void main(String[] args) {
        NufusIdaresi builder = new NufusIdaresi("John", "Doe");
        builder.setName("Ahmet").setSurname("Deneme");
        finalDeneme person = new finalDeneme(builder);
        // person.name = "Mehmet"; // Error:(77, 13) java: cannot assign a value to final variable name
        System.out.println(person);
        System.out.println("********************************************");
        NufusIdaresi builder2 = new NufusIdaresi()
                .setName("Ali")
                .setSurname("Veli");
        finalDeneme person2 = new finalDeneme(builder2);
        System.out.println(person2);
        builder2.name = "Mehmet";
        person2 = new finalDeneme(builder2);
        System.out.println(person2);
    }
}
