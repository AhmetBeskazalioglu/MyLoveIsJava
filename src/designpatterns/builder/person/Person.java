package designpatterns.builder.person;

import java.lang.reflect.Field;

public class Person {
    // Zorunlu alanlar
    private final String firstName;
    private final String lastName;

    // İsteğe bağlı alanlar
    private final int age;
    private final String phone;
    private final String address;

    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Getter metodları
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // Builder sınıfı. Nested sınıf olarak tanımlanmıştır.
    // Nested sınıflar ancak static olarak tanımlanabilir.
    public static class PersonBuilder {
        // Zorunlu alanlar
        private final String firstName;
        private final String lastName;

        // İsteğe bağlı alanlar
        private int age;
        private String phone;
        private String address;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this; // Builder nesnesini döndürerek method chaining yapılmasını sağlar.
        }

        public PersonBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("John", "Doe")
                .age(30)
                .phone("123-456-7890")
                .address("123 Main St")
                .build();


        System.out.println(person);

        PersonBuilder personBuilder = new PersonBuilder("Jane", "Doe");
        personBuilder.age(25);
        personBuilder.age(26);
        personBuilder.age=27;
        Person person2 = new Person(personBuilder);

        // reflection ile Person class'ının deişkenlerine assign edeceğiz.
        /*Class clazz = Person.class;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                if (field.getName().equals("age")) {
                    field.set(person2, 37);
                } else if (field.getName().equals("phone")) {
                    field.set(person2, "987-654-3210");
                } else if (field.getName().equals("address")) {
                    field.set(person2, "456 Main St");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }*/
        System.out.println(person2);
    }
}

