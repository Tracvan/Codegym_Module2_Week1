public class Square extends Rectangle {
    double side = 1;
    public Square(){
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double width,double length, String color, boolean filled){
        super (width,length,color,filled);
        this.side = side;

    }
    public double getArea(double side){
        return side*side;
    }
    public double getPerimeter(double side){
        return 2*side;
    }
    public String toString(){
        return "A square with side= "
                +side
                +", which is a subclass of Retangle"
                + super.toString();
    }
}

