package javamodules.enums;

public enum Priority {
    LOW(1), MEDIUM(5), HIGH(10);

    private final int level;

    Priority(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
