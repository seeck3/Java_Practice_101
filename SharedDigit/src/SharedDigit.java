public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        while (num1 > 0) {
            int digit = num1 % 10;
            int num22 = num2;
            while (num22 > 0) {
                int digitNum2 = num22 % 10;
                if (digit == digitNum2) {
                    return true;
                }
                num22 = num22 / 10;
            }
            num1 = num1 / 10;
        }

        return false;
    }
}
