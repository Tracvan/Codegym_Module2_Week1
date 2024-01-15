import java.util.Scanner;
public class Greeting {
    public static void main(String[]args){
        System.out.printf("Enter your name ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Hello %s ", name);
    }
}
