public class App {
    public static void main(String[] args) throws Exception {
        printDayOfTheWeek(1);
    }

    private static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Modnday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}
