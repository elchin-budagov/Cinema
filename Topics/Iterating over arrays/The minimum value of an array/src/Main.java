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

        Arrays.sort(array);

        System.out.println(array[0]);
    }
}