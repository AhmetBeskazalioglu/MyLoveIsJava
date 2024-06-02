package javamodules.enums;

public enum WeekDays {
    MONDAY("Pazartesi"),
    TUESDAY("Salı"),
    WEDNESDAY("Çarşamba"),
    THURSDAY("Perşembe"),
    FRIDAY("Cuma"),
    SATURDAY("Cumartesi"),
    SUNDAY("Pazar");

    private final String turkishName;

    WeekDays(String turkishName) {
        this.turkishName = turkishName;
    }

    public String getTurkishName() {
        return turkishName;
    }
}