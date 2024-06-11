package codetraining.ct08_maashesaplama;

public abstract class Employees {
    public String name;
    public double salary;
    public int workHours;
    public int hireYear;

    public Employees(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 80000) {
            return this.salary * 0.05;
        } else if (this.salary > 20000) {
            return this.salary * 0.03;
        } else {
            return 0.00;
        }
    }

    public double bonus(){
        if (workHours>40){
            return (workHours-40)*300;
        }
        return 0.00;
    }

    public double raiseSalary(){
        if ((2024-hireYear)>19){
            return salary*0.5;
        } else if ((2024-hireYear)>9) {
            return salary*0.4;
        } else
            return salary*0.35;
    }

}
