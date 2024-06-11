package javamodules.enums;

public class Day_Test {
    public static void main(String[] args) {
        Day today = Day.SATURDAY;
        if (today.isWeekend()) {
            System.out.println("Today is a weekend!");
        } else {
            System.out.println("Today is a weekday.");
        }
    }
}
