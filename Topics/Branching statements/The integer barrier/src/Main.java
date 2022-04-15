import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean end = false;

        while (!end) {
            int number = scanner.nextInt();
            sum += number;
            if (number == 0 || sum >= 1000) {
                end = true;
            }
        }
        if (sum >= 1000) {
            System.out.println(sum - 1000);
        } else {
            System.out.println(sum);
        }
    }
}