import java.util.Scanner;

public class DrawGeomytry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("1: Draw triangle ");
        System.out.println("2: Draw square ");
        System.out.println("3: Draw retangle ");
        System.out.println("0 : Exit ");
        System.out.println("Enter your choice");
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                break;
            case 3:
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                System.out.println("* * * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
