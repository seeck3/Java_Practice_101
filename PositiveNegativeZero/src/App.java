public class App {
    public static void main(String[] args) throws Exception {
        int test = checkNumber(123);
        System.out.println(test);
    }

    public static int checkNumber(int num) {
        if (num > 0) {
            System.out.println("positive");
            num = num + 1;
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("equal to 0");
        }
        return num;
    }
}
