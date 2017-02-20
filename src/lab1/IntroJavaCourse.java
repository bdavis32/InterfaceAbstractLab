package lab1;


/**
 * Describe responsibilities here.
 *
 * @author Benjamin
 * @version 1.00
 */
public class IntroJavaCourse extends TechCourse {
private double credits;
    public IntroJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    @Override
    public void setCredits(double c) {
        if (c < 0.5 || c > 4.0) {
            throw new IllegalArgumentException("Credits must be in the range of 0.5 to 4.0");
        }
        this.credits = c;
    }

}
