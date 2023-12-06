package lab2;

public class IntroJavaCourse implements CourseInterface {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
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

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
    public String getCourseInfo() {
        return "Intro Java Course:\n" +
                "Course Name: " + getCourseName() + "\n" +
                "Course Number: " + getCourseNumber() + "\n" +
                "Credits: " + getCredits() + "\n" +
                "Prerequisites: " + getPrerequisites() + "\n";
    }
}
