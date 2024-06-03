package javamodules.enums;

public enum WeekDays {
    MONDAY("Pazartesi",1),
    TUESDAY("Salı",2),
    WEDNESDAY("Çarşamba",3),
    THURSDAY("Perşembe",4),
    FRIDAY("Cuma",5),
    SATURDAY("Cumartesi",6),
    SUNDAY("Pazar",7);

    private final String turkishName;
    private final int dayNumber;

    WeekDays(String turkishName, int dayNumber) {
        this.turkishName = turkishName;
        this.dayNumber = dayNumber;
    }

    public String getTurkishName() {
        return turkishName;
    }

    public int getDayNumber() {
        return dayNumber;
    }
}