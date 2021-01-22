public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabytes = kiloBytes / 1024;
        // int megabytes = 0;
        // System.out.println(megabytes);
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kiloBytes % 1024 + " KB");
        }
    }
}
