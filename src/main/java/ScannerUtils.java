import java.util.Scanner;

public class ScannerUtils {

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Integer inputInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
