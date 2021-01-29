public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) {
            return -1;
        }

        int lastNum = num % 10;

        if (num / 10 == 0) {
            return num += num;
        }

        while (num > 9) {

            num = num / 10;
        }

        return num + lastNum;
    }
}
