public class App {

    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        long testLong = 50000L;
        System.out.println(longTotal);
        System.out.println(testLong);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));

        int testInt = 1;

        char testString = (char) testInt;
        System.out.println(testString);
        // String testString = (String) testInt;
    }
}
