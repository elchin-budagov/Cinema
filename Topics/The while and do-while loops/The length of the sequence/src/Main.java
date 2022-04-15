import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int input = scanner.nextInt();

        while (input != 0) {
            counter++;
            input = scanner.nextInt();
        }
        System.out.println(counter);
    }
}