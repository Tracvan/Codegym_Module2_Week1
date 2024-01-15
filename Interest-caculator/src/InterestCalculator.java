import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your investment amount:");
        double money = scanner.nextDouble();
        System.out.println("Input number of months:");
        int month = scanner.nextInt();
        System.out.println("Input annual interest rate in percentage:");
        double percentage = scanner.nextDouble();

        double  totalInterest = 0;
        for (int i=0 ; i<month; i++){
            totalInterest += money *( percentage/100/12)*month;
        }
        System.out.println("Your total interest: " + totalInterest);
    }
}
