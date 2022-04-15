import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        final int ten = 10;
        
        boolean result = number < ten;
        
        System.out.print(result);
    }
}
