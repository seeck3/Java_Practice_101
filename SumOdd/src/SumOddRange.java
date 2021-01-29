public class SumOddRange {
    public static boolean isOdd(int num) {
        if (num < 0) {
            return false;
        }
        if (num % 2 == 1) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int result = 0;
        if (start < 0 || end < 0 || end < start) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                result += i;
            }
        }
        return result;
    }
}