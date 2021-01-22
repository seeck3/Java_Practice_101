public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int minTemp = 25;
        int maxTemp = 35;
        if (summer) {
            maxTemp = 45;
        }
        if (temperature >= minTemp && temperature <= maxTemp) {
            return true;
        }
        return false;
    }
}
