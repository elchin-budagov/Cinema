import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        String newString = word.substring(first, second+1);

        System.out.println(newString);
    }
}