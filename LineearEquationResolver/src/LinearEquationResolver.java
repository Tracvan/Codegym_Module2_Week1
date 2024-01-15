import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[]args){
        System.out.println("Linear Equation Resolver");
        System.out.println("Give equation ass 'a * x + b = c' pleas enter constants");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        if ( a != 0 ){
            double answer = (b - c ) / a;
            System.out.printf("Equation pass width x = %f!\n ",answer);
        } else {
            if ( b == c){
                System.out.print("The solution is all x!");
            }else{
                System.out.println("No solution.");
            }
        }

    }
}
