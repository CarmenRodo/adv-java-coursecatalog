package lab1;

import javax.swing.*;

/**

 * @Rodolfo your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends Course {

    private String prerequisites; // Unique property for AdvancedJavaCourse


    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber); // Initialize common properties using the superclass constructor
    }


    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null or empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        super.setCredits(credits); // Call superclass method to set credits
    }
}
