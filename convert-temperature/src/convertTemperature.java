import java.util.Scanner;

public class convertTemperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu.");
        System.out.println("1. Fahrenheit to Celsius ");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        System.out.println("Enter degree:");
        double degree = scanner.nextDouble();
        switch (choice) {
            case 1:
                FToC(degree);
                System.out.println(FToC(degree));
                break;
            case 2:
                CToF(degree);
                System.out.println(CToF(degree));
                break;
            case 0:
                System.exit(0);
        }

    }

    public static double FToC(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }

    public static double CToF(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }
}
