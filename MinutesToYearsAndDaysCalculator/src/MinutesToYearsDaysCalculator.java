public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long mins) {
        if (mins < 0) {
            System.out.println("Invalid Value");
        } else {

            long hours = mins / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;

            // if (days == 1) {
            // remainingDays = days;
            // }

            String result = mins + " min = " + years + " y and " + remainingDays + " d";
            System.out.println(result);
        }
    }

}
