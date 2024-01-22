public class Cylinder extends Circle {
    double height = 1;
    Cylinder(){

    }
    Cylinder(double radius){
        super(radius);
    }
    Cylinder(double radius, String color){
        super(radius,color);
    }
    Cylinder(double radius, String color, double height){
        this.radius = radius;
        this.color = color;
        this.height = height;
    }
    public void setColor (String color){
        this.color = super.getColor(color);
    }
    public String getColor(String color){
       return super.getColor(color);
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
       return height;
    }
    public double getV(){
        return super.getArea() * getHeight();
    }
    public double getArea(){
        return super.getArea();
    }
    @Override
    public String toString(){
        return "A "
                + getColor(color)
                + " Cynlinder with radius= "
                + getColor(color)
                +" and height ="
                + getHeight()
                +", which is subclass of Circle and V is = "
                + getV();
    }

}
