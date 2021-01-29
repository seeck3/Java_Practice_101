public class NumberToWords {

    public static int getDigitCount(int num) {
        int count = 1;
        if (num < 0) {
            return -1;
        }

        while (num > 9) {
            count += 1;
            num = num / 10;
        }
        return count;
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num < 0) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num = num / 10;
        }

        while (num > 0) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num = num / 10;
        }
        return reversed;
    }

    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
        } else {
            int i = 1;
            int reversed = reverse(num);
            while (i <= getDigitCount(num)) {
                int digit = reversed % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversed = reversed / 10;
                i++;
            }
        }
    }
}
