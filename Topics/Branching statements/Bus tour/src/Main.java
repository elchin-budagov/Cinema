import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int crashedBridge = 0;
        boolean crashed = false;

        for (int i = 1; i <= numberOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (crashedBridge != 0)
                crashed = true;
            if (bridgeHeight <= busHeight) {
                if (!crashed)
                    crashedBridge = i;
            }
        }

        if (crashedBridge == 0)
            System.out.println("Will not crash");
        else {
            System.out.println("Will crash on bridge " + crashedBridge);
        }
    }
}