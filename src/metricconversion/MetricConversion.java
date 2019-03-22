 * David Lutelmowski
 * 19/03/19
 * MetricConversion
 */
package metricconversion;
import java.util.Scanner;

/**
 *
 * @author dalut3278
 */
    public class MetricConversion {

    /**
     * @pre value that is going to be converted 
     * @post conversion of input of the selected option 
     */
    
    // Converts inches to centimeters
    public static double inchesToCentimeters(double value) {
        double iToC;
        iToC = value * (2.54);
        return iToC;
    }
    // Converts inches to centimeters
    public static double centimetersToInches(double value) {
        double cToI;
        cToI = value / (2.54);
        return cToI;
    }
    // Converts feet to centimeters
    public static double feetToCentimeters(double value) {
        double fToC;
        fToC = value * (30);
        return fToC;
    }
    // Converts centimeters to feet
    public static double centimetersToFeet(double value) {
        double cToF;
        cToF = value * (30);
        return cToF;
    }
    // Converts yards to meters
    public static double yardsToMeters(double value) {
        double yToM;
        yToM = value * (0.91);
        return yToM;
    }
    // Converts meters to yards
    public static double metersToYards(double value) {
        double mToY;
        mToY = value / (0.91);
        return mToY;
    }
    // Converts miles to kilometers
    public static double milesToKilometers(double value) {
        double mToK;
        mToK = value * (1.6);
        return mToK;
    }
    // Converts kilometers to miles
    public static double kilometersToMiles(double value) {
        double kToM;
        kToM = value / (1.6);
        return kToM;
    }

    public static void main(String[] args) {
        
        menu();
    }
 
    public static void menu() {
        
        int choice;
        double value;
        Scanner input = new Scanner(System.in);
        
        /* Prompt user for type of conversion */
        System.out.println("1. Inches to Centimeters.");
        System.out.println("2. Centimeters to Inches.");
        System.out.println("3. Feet to Centimeters.");
        System.out.println("4. Centimeters to Feet.");
        System.out.println("5. Yards to Meters.");
        System.out.println("6. Meters to Yards.");
        System.out.println("7. Miles to Kilometers.");
        System.out.println("8. Kilometers to Miles.");
        System.out.print("Enter option: ");
        choice = input.nextInt();
        System.out.print("Enter the value: ");
        value = input.nextDouble();
        switch (choice) {
            case 1:
                System.out.println(+inchesToCentimeters(value) + " Centimeters");
                break;
            case 2:
                System.out.println(+centimetersToInches(value) + " Inches");
                break;
            case 3:
                System.out.println(+feetToCentimeters(value) + " Centimeters");
                break;
            case 4:
                System.out.println(+centimetersToFeet(value) + " Feet");
                break;
            case 5:
                System.out.println(+yardsToMeters(value) + " Meters");
                break;
            case 6:
                System.out.println(+metersToYards(value) + " Yards");
                break;
            case 7:
                System.out.println(+milesToKilometers(value) + " Kilometers");
                break;
            case 8:
                System.out.println(+kilometersToMiles(value) + " Miles");
                break;
        }
        input.close();
    }
}
