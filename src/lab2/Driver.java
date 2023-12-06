package lab2;

public class Driver {
    public static void main(String[] args) {
        // Create instances of courses...
        IntroJavaCourse javaCourse = new IntroJavaCourse("Introduction to Java", "JAVA101");
        javaCourse.setCredits(4.0);
        javaCourse.setPrerequisites("Basic Programming");

        AdvancedJavaCourse advancedJavaCourse = new AdvancedJavaCourse("Advanced Java", "ADVJ102");
        advancedJavaCourse.setCredits(5.0);
        advancedJavaCourse.setPrerequisites("Introduction to Java");

        IntroToProgrammingCourse programmingCourse = new IntroToProgrammingCourse("Intro to Programming", "PRG101");
        programmingCourse.setCredits(3.0);


        // Output course information using the new method
        System.out.println(javaCourse.getCourseInfo());
        System.out.println(advancedJavaCourse.getCourseInfo());
        System.out.println(programmingCourse.getCourseInfo());

        // ... Additional tests if needed
    }
}
