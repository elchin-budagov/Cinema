import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean neverOccured = true;

        for (int i = 0; i < arraySize - 1; i++) {
            if (array[i] == n && array[i+1] == m) {
                neverOccured = false;
            }
            if (array[i] == m && array[i+1] == n) {
                neverOccured = false;
            }
        }

        System.out.println(neverOccured);
    }
}