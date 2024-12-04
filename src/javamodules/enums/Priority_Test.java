package javamodules.enums;

public class Priority_Test {
    public static void main(String[] args) {
        for (Priority p : Priority.values()) {
            System.out.println(p + " priority level: " + p.getLevel());
        }

        Priority taskPriority = Priority.HIGH;

        switch (taskPriority) {
            case LOW:
                System.out.println("Low priority task.");
                break;
            case MEDIUM:
                System.out.println("Medium priority task.");
                break;
            case HIGH:
                System.out.println("High priority task.");
                break;
        }
    }
}
