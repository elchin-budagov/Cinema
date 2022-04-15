import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[][] twoDimArray = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        int[][] newArray = new int[b][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                newArray[j][a - 1 - i] = twoDimArray[i][j];
            }
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }


    }
}
