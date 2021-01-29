public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int i = 1;
        int result = 0;
        while (i <= first) {
            if ((first % i == 0) && (second % i == 0)) {
                result = i;
            }
            i++;
        }

        return result;
    }

}
