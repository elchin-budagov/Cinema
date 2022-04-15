import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCost = scanner.nextInt();

        final int flightNumber = 2;
        final int nights = duration - 1;

        int result = flightNumber * flightCost +
                duration * foodCost +
                hotelCost * nights;

        System.out.println(result);

    }
}
