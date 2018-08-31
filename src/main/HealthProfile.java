package main;

/** HealthProfile class contains useful info about a person's health.
 */
public class HealthProfile {
    // FILL IN CODE
    // Add instance variables of the class:
    // a person's name, gender,
    // age, height (in inches) and weight (in pounds).


    /**
     * Constructor for class HealthProfile
     * @param name name of the person
     * @param gender gender, "female" or "male"
     * @param age    age (as an integer)
     * @param height height in inches
     * @param weight weight in pounds
     */
    public HealthProfile(String name, String gender, int age,
                         double height, double weight) {
        // FILL IN CODE - assign values to instance variables of the class

    }

    /**
     * Returns the maximum heart rate computed using the
     * following formula: maximumRate = 220 – (age in years)
     * @return the maximum heart rate
     */
    public int computeMaximumHeartRate() {
        int maxRate = 0;
        // FILL IN CODE

        return maxRate;
    }

    /** Returns a target heart rate range as a string,
     *  with the min and the max rates separated by a dash.
     *  Min and max rates should be integers (cast as needed).
     *  Target heart rate range is 50-85% of the maximum heart rate.
     *  @return target heart rate range
     */
    public String computeTargetHeartRateRange() {
        String result = "";
        // FILL IN CODE


        return result;
    }

    /** Returns the body mass index, computed using the following
     * formula: BMI = weight * 703 / (height*height)
     * @return body mass index
     */
    public double computeBMI() {
        double bmi = 0;
        // FILL IN CODE

        return bmi;
    }

    /**
     * Return a string representing this health profile.
     * The string should contain name,age,gender,height,weight
     * separated by commas.
     * @return string with info from the health profile
     */
    public String toString() {
        String res = "";
        // FILL IN CODE

        return res;
    }
}
