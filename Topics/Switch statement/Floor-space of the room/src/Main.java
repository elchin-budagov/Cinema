import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        double area = 0;
        double a = 0;
        double b = 0;
        double c = 0;
        double r = 0;


        switch (input) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double s = (a+b+c)/2;
                area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                area = a * b;
                break;
            case "circle":
                r = scanner.nextDouble();
                area = 3.14 * r * r;
                break;
        }

        System.out.println(area);
    }
}