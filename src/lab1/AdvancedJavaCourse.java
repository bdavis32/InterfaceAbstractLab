package lab1;


/**
 * Describe responsibilities here.
 *
 * @author Benjamin
 * @version 1.00
 */
public class AdvancedJavaCourse extends TechCourse {
    private double credits;
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    @Override
    public void setCredits(double c) {
        if (c < 0.5 || c > 4.0) {
            throw new IllegalArgumentException(
                    "Error: credits must be in the range 0.5 to 4.0");
        }
        this.credits = c;
    }

}
