//import stuff here?

public class Program5 {
    public static void main(String[] args) {
        // Vehicle data
        String vehicle1 = "Royale";
        int miles1 = 286;
        int gallons1 = 9;

        String vehicle2 = "Koopa King";
        int miles2 = 412;
        int gallons2 = 40;

        String vehicle3 = "Pipe Frame";
        int miles3 = 361;
        int gallons3 = 18;

        String vehicle4 = "Badwagon";
        int miles4 = 161;
        int gallons4 = 11;

        // Calculate miles per gallon for each vehicle
        double mpg1 = (double) miles1 / gallons1;
        double mpg2 = (double) miles2 / gallons2;
        double mpg3 = (double) miles3 / gallons3;
        double mpg4 = (double) miles4 / gallons4;

        // Manually round to the nearest 10th
        mpg1 = (int) (mpg1 * 10 + 0.5) / 10.0;
        mpg2 = (int) (mpg2 * 10 + 0.5) / 10.0;
        mpg3 = (int) (mpg3 * 10 + 0.5) / 10.0;
        mpg4 = (int) (mpg4 * 10 + 0.5) / 10.0;

        // Output the results
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:\n");
        System.out.println(vehicle1 + " averaged " + mpg1 + " m/g");
        System.out.println(vehicle2 + " averaged " + mpg2 + " m/g");
        System.out.println(vehicle3 + " averaged " + mpg3 + " m/g");
        System.out.println(vehicle4 + " averaged " + mpg4 + " m/g");
    }
}

//Paste console output below:
/*


*/
