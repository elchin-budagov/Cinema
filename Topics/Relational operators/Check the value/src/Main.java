import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        final int minValue = 0;
        final int maxValue = 10;

        boolean result = value > minValue && value < maxValue;
        System.out.println(result);

    }
}
