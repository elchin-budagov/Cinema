package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int columns = scanner.nextInt();
        System.out.println();

        char[][] cinema = new char[rows][columns];
        for (char[] row : cinema) {
            Arrays.fill(row, 'S');
        }

        boolean goOn = true;
        while (goOn) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            int answer = scanner.nextInt();
            System.out.println();

            switch (answer) {
                case 1:
                    printCinema(cinema);
                    break;
                case 2:
                    boolean seatPicked = false;
                    while (!seatPicked) {
                        System.out.println("Enter a row number:");
                        int seatRow = scanner.nextInt();
                        System.out.println("Enter a seat number in that row:");
                        int seatColumn = scanner.nextInt();

                        if (seatRow > rows || seatColumn > columns) {
                            System.out.println("Wrong input!");
                        } else if (cinema[seatRow-1][seatColumn-1] == 'B'){
                            System.out.println("That ticket has already been purchased!\n");
                        } else {
                            seatPicked = true;
                            buyTicket(cinema, seatRow, seatColumn);
                        }
                    }
                    break;
                case 3:
                    numberOfPurchasedTickets(cinema);
                    income(cinema);
                    break;
                case 0:
                    goOn = false;
                    break;
            }
        }
    }

    public static void printCinema(char[][] cinema) {
        int rows = cinema.length;
        int columns = cinema[0].length;

        System.out.println();
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int j =1; j <= columns; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print(i+1 + " ");
            for(int j = 0; j < columns; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void numberOfPurchasedTickets(char[][] cinema) {
        int rows = cinema.length;
        int columns = cinema[0].length;
        int seats = rows * columns;
        int numOfPurTick = 0;

        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if (cinema[i][j] == 'B') {
                    numOfPurTick++;
                }
            }
        }
        System.out.println("Number of purchased tickets: " +
        numOfPurTick);

        double percentage = (double) numOfPurTick / seats * 100;
        System.out.printf("Percentage: %.2f%% \n", percentage);
    }

    public static void income(char[][] cinema) {
        int rows = cinema.length;
        int columns = cinema[0].length;
        int seats = rows * columns;
        int firstHalf = rows / 2;
        int secondHalf = rows - firstHalf;
        int totalIncome;
        if (seats > 60) {
            totalIncome = firstHalf * columns * 10 +
                    secondHalf * columns * 8;
        } else {
            totalIncome = seats * 10;
        }
        int currentIncome = 0;

        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if (cinema[i][j] == 'B') {
                    if (seats <= 60) {
                        currentIncome += 10;
                    } else if (i < firstHalf) {
                        currentIncome += 10;
                    } else {
                        currentIncome += 8;
                    }
                }
            }
        }
        System.out.printf("Current income: $%d\n", currentIncome);
        System.out.printf("Total income: $%d\n", totalIncome);
        System.out.println();

    }

    public static void buyTicket(char[][] cinema, int seatRow, int seatColumn) {
        int rows = cinema.length;
        int columns = cinema[0].length;

        int seats = rows * columns;
        int firstHalf = rows / 2;
        int ticketPrice;

        if (seats <= 60) {
            ticketPrice = 10;
        } else {
            if (seatRow <= firstHalf) {
                ticketPrice = 10;
            } else {
                ticketPrice = 8;
            }
        }

        System.out.print("Ticket Price: ");
        System.out.println("$" + ticketPrice);
        System.out.println();

        cinema[seatRow-1][seatColumn-1] = 'B';
    }
}