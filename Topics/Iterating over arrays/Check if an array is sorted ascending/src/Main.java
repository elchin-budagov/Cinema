import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int[] numbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean ascending = true;

        for (int i = 0; i < arraySize-1; i++) {
            if (numbers[i] > numbers[i+1]) {
                ascending = false;
            }
        }
        System.out.println(ascending);

    }
}