package lab2;


public class IntroToProgrammingCourse implements CourseInterface {

    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        this.credits = credits;
    }

    @Override
    public void setPrerequisites(String basicProgramming) {

    }

    @Override
    public String getPrerequisites() {
        return null;
    }
    public String getCourseInfo() {
        return "Intro to Programming Course:\n" +
                "Course Name: " + getCourseName() + "\n" +
                "Course Number: " + getCourseNumber() + "\n" +
                "Credits: " + getCredits() + "\n";
    }
}
