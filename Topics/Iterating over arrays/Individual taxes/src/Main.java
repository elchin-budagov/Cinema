import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] income = new int[size];
        int[] taxPercent = new int[size];

        for (int i = 0; i < size; i++) {
            income[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            taxPercent[i] = scanner.nextInt();
        }

        double maxTax = 0;
        int theCompany = 0;
        boolean found = false;

        for (int i = 0; i < size; i++) {
            double tax = income[i] * taxPercent[i];
            if (tax > maxTax) {
                maxTax = tax;
                theCompany = i + 1;
            }
        }

        System.out.println(theCompany);


    }
}