public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        if (kilometersPerHour < 0) {
            return -1;
        }
        return milesPerHour;

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
            System.out.println("km/h === mile/h");
        }
    }
}
