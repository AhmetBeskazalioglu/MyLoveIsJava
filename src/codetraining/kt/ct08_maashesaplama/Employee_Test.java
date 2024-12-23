package codetraining.kt.ct08_maashesaplama;

public class Employee_Test {
    public static void main(String[] args) {
        Employees employee=new Employee("Ali", 20000, 45, 1985);
        System.out.println(employee.toString());
        System.out.println("**********************************");
        Employees employee2=new Employee("Veli", 10000, 35, 2000);
        System.out.println(employee2.toString());
        System.out.println("**********************************");
        Employees employee3=new Employee("Ahmet", 55000, 25, 2010);
        System.out.println(employee3.toString());

    }
}
