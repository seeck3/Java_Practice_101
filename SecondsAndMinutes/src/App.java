public class App {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) throws Exception {
        getDurationString(451, 60);
        getDurationString(3600);
    }

    public static String getDurationString(int min, int sec) {
        if (min < 0 || sec < 0 || sec > 60) {

            System.out.println(INVALID_VALUE_MESSAGE);
            return INVALID_VALUE_MESSAGE;
        }

        int hour = min / 60;
        int remainingMin = min % 60;

        String hoursString = hour + "h ";
        if (hour < 10) {
            hoursString = "0" + hoursString;
        }

        String minString = remainingMin + "m ";
        if (remainingMin < 10) {
            minString = "0" + minString;
        }

        String secString = sec + "s ";
        if (sec < 10) {
            secString = "0" + secString;
        }

        String result = hoursString + minString + secString;
        System.out.println(result);
        return result;
    }

    public static String getDurationString(int sec) {
        if (sec < 0) {

            System.out.println(INVALID_VALUE_MESSAGE);
            return INVALID_VALUE_MESSAGE;
        }
        int min = sec / 60;
        int remainingSec = sec % 60;
        return getDurationString(min, remainingSec);
    }

}
