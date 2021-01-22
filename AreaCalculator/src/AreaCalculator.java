public class AreaCalculator {

    private static double PI = Math.PI;

    public static double area(double radius) {
        if (radius < 0)
            return -1.0;
        double result = radius * radius * PI;
        return result;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        double result = x * y;
        return result;
    }
}