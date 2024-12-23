package codetraining.kt.ct08_maashesaplama;

public class Employee extends Employees{

    public Employee(String name, double salary, int workHours, int hireYear) {
        super(name, salary, workHours, hireYear);
    }

    @Override
    public String toString() {
        return "Adı: " + name + "\nMaaşı: " + salary + "\nÇalışma Saati: "
                + workHours + "\nBaşlangıç Yılı: " + hireYear + "\nVergi: "
                + tax() + "\nBonus: " + bonus() + "\nMaaş Artışı: " + raiseSalary();
    }
}
