import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double fArg, double sArg) {

        System.out.println((int) (fArg * 1000));
        System.out.println((int) (sArg * 1000));

        /**
         * after cast, without () it returns 3000 like this not like 3175
         */
        // int a = (int) fArg * 1000;
        // int b = (int) sArg * 1000;
        // System.out.println(a);
        // System.out.println(b);
        if ((int) (fArg * 1000) == (int) (sArg * 1000)) {
            return true;
        }
        return false;
    }
}
