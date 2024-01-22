public class Retangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    Retangle(){
    }
    Retangle(double width, double length){
        this.length =length;
        this.width = width;
    }
    Retangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length =length;
    }

    public double getLength() {
        return length;
    }
    public double setLength(double length){
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double setWidth(double width){
         return width;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    @Override
    public String toString(){
        return "A Rectangle with width ="
                +getWidth()
                +" and length= "
                +getLength()
                +", which is a subclass of "
                + super.toString();
    }
}
class RectangleTest{
    public static void main(String[] args) {
        Retangle retangle = new Retangle();
        System.out.println(retangle);

        retangle = new Retangle(2.3, 5.8);
        System.out.println(retangle);

        retangle = new Retangle(2.5,3.8, "orange", false);
        System.out.println(retangle);
    }
}
