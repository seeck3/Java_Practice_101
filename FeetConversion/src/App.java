public class App {
    public static void main(String[] args) throws Exception {
        calcFeetAndInchesToCentimeters(5, 7);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(centimeters);

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(centimeters);

        return centimeters;
    }
}
