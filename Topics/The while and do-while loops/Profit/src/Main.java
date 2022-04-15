import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();

        double totalMoney = m;

        int counter = 0;

        while (totalMoney < k) {
            totalMoney = totalMoney + totalMoney * p / 100;
            counter++;
        }

        System.out.println(counter);
    }
}