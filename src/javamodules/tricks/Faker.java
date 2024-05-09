package javamodules.tricks;

public class Faker {


    public static void main(String[] args) {

        com.github.javafaker.Faker faker = new com.github.javafaker.Faker();

        for (int i = 1; i < 11; i++) {
            System.out.println(
                    "insert into personal_education values " +
                            "("+ i + ",'" +
                            /*faker.company().name() + "','" +
                            faker.address().fullAddress() + "','" +
                            faker.phoneNumber().phoneNumber() + "','" +
                            faker.company().industry() +"','"+*/
                            faker.educator().university() +"','"+
                            faker.educator().course() +"','"+
                            faker.educator().campus() +"','"+
                            faker.number().numberBetween(1980,2024) +
                            "');");
        }

        /*for (int i = 1; i < 11; i++) {
            System.out.println(
                    "insert into personal_job (id,dept,company) values " +
                            "("+ i + ",'" +
                            faker.number().numberBetween(1000,50000) + "','" +
                            faker.company().name() +
                            "')");

        }*/




    }

}


