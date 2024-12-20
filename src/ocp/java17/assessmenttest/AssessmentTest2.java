package ocp.java17.assessmenttest;

public class AssessmentTest2 {
    public static void main(String[] args) {
        int moon = 9, star = 2 + 2 * 3;
        float sun = star > 10 ? 1 : 3;
        double jupiter = (sun + moon) - 1.0f;
        int mars = --moon <= 8 ? 2 : 3;

        System.out.println(sun + ", " + jupiter + ", " + mars);
    }
}
