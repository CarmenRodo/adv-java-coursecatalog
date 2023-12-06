package lab2;

public interface CourseInterface {
    String getCourseName();
    void setCourseName(String courseName);
    String getCourseNumber();
    void setCourseNumber(String courseNumber);
    double getCredits();
    void setCredits(double credits);

    void setPrerequisites(String Prerequisites);

    String getPrerequisites();
}
