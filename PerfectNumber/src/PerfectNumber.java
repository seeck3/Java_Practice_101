public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if (num < 1) {
            return false;
        }
        int sum = 0;
        int i = 1;
        while (i != num) {
            if (num % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == num) {
            return true;
        }
        return false;
    }
}
