import main.HealthProfile;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/** The class contains JUnit tests for class HealthProfile */
public class HealthProfileTester {
    private HealthProfile profile;
    public final static double EPS = 0.01;

    @Before
    public void setup() {
        profile = new HealthProfile("Lee", "female", 26, 67, 150);
    }

    @Test
    public void testToString() {
        String studentResult = profile.toString();
        System.out.println(studentResult);
        String expectedResult = "Lee,26,female,67.0,150.0";

        assertTrue("toString method in class HealthProfile is incorrect. Expected: Lee,female,26,67.0,150.0",studentResult.equals(expectedResult));
    }

    @Test
    public void testComputeMaximumHeartRate() {
        double maxHeartRate = profile.computeMaximumHeartRate();
        double expectedResult = 194.0;
        boolean comparison = Math.abs(maxHeartRate - expectedResult) < EPS;

        assertTrue("maxHeartRate is incorrect: expected value is 194. ", comparison);
    }

    @Test
    public void testComputeTargetHeartRateRange() {
        String studentRes = profile.computeTargetHeartRateRange();
        String expectedRes = "97-164";
        assertTrue("computeTargetHeartRateRange method in class HealthProfile is incorrect. Expected string: 97-164", studentRes.equals(expectedRes));
    }

    @Test
    public void testComputeBMI() {
        double bmi = profile.computeBMI();
        System.out.println(bmi);
        double expectedRes = 23.49;
        boolean comparison = Math.abs(bmi - expectedRes) < EPS;

        assertTrue("computeBMI is incorrect: expected value is 23.49. ", comparison);
    }
}

