import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for (int i = 1; i <= n; i++) {
            String grade = scanner.next();
            if ("A".equals(grade)) {
                countA++;
            } else if ("B".equals(grade)) {
                countB++;
            } else if ("C".equals(grade)) {
                countC++;
            } else if ("D".equals(grade)) {
                countD++;
            }
        }

        System.out.print(countD + " ");
        System.out.print(countC + " ");
        System.out.print(countB + " ");
        System.out.print(countA + " ");

    }
}