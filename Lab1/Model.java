package Lab1;

import java.security.InvalidParameterException;

/**
 * @author Junya Ishibuchi
 */
public class Model {
    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;


    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    public Model() {
    }

    /**
     * @param firstName model's first name
     * @param lastName model's last name
     * @param height model's height in inches
     * @param weight model's weight in pounds
     * @param canTravel model's can travel
     * @param smokes model's is smokes
     */
    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeight(height);
        this.setWeight(weight);
        this.setCanTravel(canTravel);
        this.setSmokes(smokes);
    }

    /**
     * @param firstName model's first name
     * @param lastName model's last name
     * @param height model's height in inches
     * @param weight model's weight in pounds
     */
    public Model(String firstName, String lastName, int height, double weight) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeight(height);
        this.setWeight(weight);
        this.setCanTravel(true);
        this.setSmokes(false);
    }

    /**
     * @param firstName set model's first name
     */
    private void setFirstName(String firstName) {
        if (firstName.length() < 3 || firstName.length() > 20) {
            throw new InvalidParameterException("First name must be 3 to 20 characters long");
        }

        this.firstName = firstName;
    }

    /**
     * @param lastName set model's last name
     */
    private void setLastName(String lastName) {
        if (lastName.length() < 3 || lastName.length() > 20) {
            throw new InvalidParameterException("Last name must be 3 to 20 characters long");
        }

        this.lastName = lastName;
    }

    /**
     * @param inches set model's inches
     */
    public void setHeight(int inches) {
        if (inches < 24 || inches > 84) {
            throw new InvalidParameterException("Height must be 24 to 84 inches");
        }

        this.height = inches;
    }

    /**
     * @param feet set model's feet
     * @param inches set model's inches
     */
    public void setHeight(int feet, int inches) {
        this.setHeight(feet * INCHES_PER_FOOT + inches);
    }

    /**
     * @param pounds set model's pounds
     */
    public void setWeight(double pounds) {
        if (pounds < 80 || pounds > 280) {
            throw new InvalidParameterException("Weight must be 80 to 280 pounds");
        }

        this.weight = pounds;
    }

    /**
     * @param kilograms set model's kilograms
     */
    public void setWeight(long kilograms) {
        this.setWeight((double)kilograms * POUNDS_PER_KG);
    }

    /**
     * @param canTravel set model's can travel
     */
    private void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     * @param smokes set model's is smokes
     */
    private void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    /**
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return inches
     */
    public int getHeight() {
        return height;
    }

    /**
     * @return pounds
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @return kilograms
     */
    public double getWeightKg() {
        return Math.round(weight / POUNDS_PER_KG);
    }

    /**
     * @return canTravel
     */
    public boolean isCanTravel() {
        return canTravel;
    }

    /**
     * @return isSmokes
     */
    public boolean isSmokes() {
        return smokes;
    }

    /**
     * @return heightInFeetAndInches
     */
    public String getHeightInFeetAndInches() {
        int feet = this.height / INCHES_PER_FOOT;
        int inches = this.height - feet * INCHES_PER_FOOT;
        String feetUnit = feet <= 1 ? "foot" : "feet";
        String inchesUnit = inches <= 1 ? "inch" : "inches";

        return String.format("%d %s %d %s", feet, feetUnit, inches, inchesUnit);
    }

    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
        System.out.println("Does " + (isCanTravel() ? "" : "not ") + "travel ");
        System.out.println("Does " + (isSmokes() ? "": "not ") + "smoke ");
    }

    /**
     * @return totalPayDollarsPerHour
     */
    public int calculatePayDollarsPerHour() {
        int total = BASE_RATE_DOLLARS_PER_HOUR;
        if (this.height > TALL_INCHES && this.weight < THIN_POUNDS) {
            total += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }
        if (this.isCanTravel()) {
            total += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        if (this.isSmokes()) {
            total -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }

        return total;
    }

    public void displayModelDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + getWeight() + " pounds");
        System.out.println("Travels: " + (isCanTravel() ?  "yep" : "nope"));
        System.out.println("Smokes: " + (isSmokes() ? "yep" : "nope"));
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
    }
}