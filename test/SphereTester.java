import main.Sphere;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/** The class contains JUnit tests for class Sphere */
public class SphereTester {
    private Sphere sphere;
    public final static double EPS = 0.01;

    @Before
    public void setup() {
        sphere = new Sphere(2.5);
    }

    @Test
    public void testVolume() {
        double studentResult = sphere.volume();
        double expectedResult = 65.45;
        boolean comparison = Math.abs(studentResult - expectedResult) < EPS;

        assertTrue("Volume is incorrect for radius 2.5: expected value is 65.45. ", comparison);
    }

    @Test
    public void testSurfaceArea() {
        double studentResult = sphere.surfaceArea();
        double expectedResult = 78.54;
        boolean comparison = Math.abs(studentResult - expectedResult) < EPS;

        assertTrue("Surface Area is incorrect for radius 2.5: expected value is 78.54. ", comparison);
    }
}
