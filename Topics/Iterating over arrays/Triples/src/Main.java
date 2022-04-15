import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int[] numbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }

        int counter = 0;

        for (int i = 0; i < arraySize - 2; i++) {
            boolean con1 = numbers[i+2] == numbers[i+1] +1;
            boolean con2 = numbers[i+1] == numbers[i] +1;
            if (con1 && con2) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}