import java.sql.SQLOutput;
import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1: Print the retangle");
        System.out.println("2: Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3: Print isosceles triangle");
        System.out.println("0: Exit");
        System.out.println("Enter your choice");
        int choice;
        int rows;
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter number of lines");
                rows = scanner.nextInt();
                for (int i = 1; i < 5; i++) {
                    System.out.println("*****");
                }
            case 2:
                System.out.printf("Enter number of lines");
                rows = scanner.nextInt();
                for (int i = rows; i >= 1; i--) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("______________");
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("______________");
                for (int i = rows; i > 1; i--) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("______________");
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("______________");
                for (int i = 1; i <= rows; i++) {
                    for (int j =1 ; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = i; k <rows; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            case 3:
                System.out.println("Enter number of lines");
                rows = scanner.nextInt();
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}



