import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n >= 1) {
            System.out.print(n + " ");
            if (n == 1) {
                break;
            }
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
        }

    }
}
