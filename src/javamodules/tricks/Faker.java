package javamodules.tricks;

public class Faker {


    public static void main(String[] args) {

        com.github.javafaker.Faker faker = new com.github.javafaker.Faker();

        for (int i = 1; i < 11; i++) {
            System.out.println("insert into personel_detay values ("+ i + ",'" + faker.job().title() + "','" + faker.company().name() + "','" + faker.company().industry() + "')");
        }




    }

}


