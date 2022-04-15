import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        int maxProduct = 0;
        for (int i = 0; i < arraySize - 1; i++) {
            int product = array[i] * array[i+1];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        System.out.println(maxProduct);
    }
}