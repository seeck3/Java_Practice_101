public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;
        while (stored > 0) {
            // extract the lest-significant digit 1221 1
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            // drop the least-significant digit 1
            stored /= 10; // same as number = number / 10;
            System.out.println(stored);
        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
