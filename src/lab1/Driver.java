package lab1;

public class Driver {
    public static void main(String[] args) {
        Course javaCourse = new IntroJavaCourse("Introduction to Java", "JAVA101");
        javaCourse.setCredits(3.0);
        javaCourse.setPrerequisites("Basic Programming");

        Course advancedJavaCourse = new AdvancedJavaCourse("Advanced Java", "ADVJAVA200");
        advancedJavaCourse.setCredits(4.0);
        advancedJavaCourse.setPrerequisites("Introduction to Java");

        Course IntroToProgrammingCourse = new IntroToProgrammingCourse("Intro to programming", "CSharp201");
        IntroToProgrammingCourse.setCredits(2.0);

        // Test and display properties of the courses
        System.out.println("Course Name: " + javaCourse.getCourseName());
        System.out.println("Credits: " + javaCourse.getCredits());
        System.out.println("Prerequisites: " + javaCourse.getPrerequisites());

        System.out.println("Course Name: " + advancedJavaCourse.getCourseName());
        System.out.println("Credits: " + advancedJavaCourse.getCredits());
        System.out.println("Prerequisites: " + advancedJavaCourse.getPrerequisites());

        System.out.println("Course Name " + IntroToProgrammingCourse.getCourseName());
        System.out.println("Credits: " + IntroToProgrammingCourse.getCredits());
        // Additional comments and observations on the architecture can be added here
    }
}

