import java.util.Scanner;
public class MoneyExchange {
    public static void main(String[]args){
        System.out.print("Amount vnđ want to exchange: ");
        Scanner scanner = new Scanner(System.in);
        float vnd = scanner.nextFloat();
        float usd = vnd/23000;
        System.out.print( "USD: " + usd);
    }
}
