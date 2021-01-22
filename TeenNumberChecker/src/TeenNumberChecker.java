public class TeenNumberChecker {
    public static boolean hasTeen(int fNum, int sNum, int tNum) {
        int[] arr = { fNum, sNum, tNum };
        for (int i = 0; i < arr.length; i++) {
            if (isTeen(arr[i]))
                return true;
        }
        return false;
    }

    public static boolean isTeen(int num) {
        if (num <= 19 && num >= 13) {
            return true;
        }
        return false;
    }
}