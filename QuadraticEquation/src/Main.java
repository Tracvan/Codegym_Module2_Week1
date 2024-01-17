import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a,b,c ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant(a,b,c);
        if(delta > 0){
            double r1 = (-b + Math.sqrt(delta))/ (2*a);
            double r2 = (-b - Math.sqrt(delta))/ (2*a);
            System.out.println("The equation has two roots " + r1 + "and " + r2);
        }else if (delta==0){
            double r = (-b + Math.sqrt(delta))/ (2*a);
            System.out.println("The equation has one root is " + r );
        }else{
            System.out.println(" The equation has no real roots");
        }
    }
}