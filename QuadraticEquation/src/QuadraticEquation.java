public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a,double b, double c){
        this.a =a;
        this.b =b;
        this.c =c;
    }
    public static double getDiscriminant(double a,double b,double c){
        double delta;
        return delta = b*b-4*a*c;
    }

}
