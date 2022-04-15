import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        boolean inRange = (first >= second && first <= third) ||
                (first <= second && first >= third);

        if (inRange) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}