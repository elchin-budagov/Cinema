import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] twoDimArray = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        int row = -1;
        int column = -1;
        int max = twoDimArray[0][0] - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (twoDimArray[i][j] > max) {
                    max = twoDimArray[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        System.out.print(row + " " + column);
    }
}
