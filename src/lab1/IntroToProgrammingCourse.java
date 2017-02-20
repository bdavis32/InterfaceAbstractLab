package lab1;


/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author Benjamin
 * @version 1.00
 */
public class IntroToProgrammingCourse extends TechCourse {
private double credits;
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
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
