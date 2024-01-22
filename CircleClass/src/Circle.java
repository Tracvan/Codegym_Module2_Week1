public class Circle {
    public double radius = 1;
    public String color = "red";
     Circle(){
     }
     Circle(double radius){
         this.radius=radius;
     }
     Circle(double radius, String color){
         this.radius=radius;
         this.color=color;
     }
     public double getRadius(double radius){
         return radius;
     }
     public void setRadius(double radius){
         this.radius = radius;
     }
    public String getColor(String color){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
     public double getArea(){
         return this.radius * this.radius * Math.PI;
     }
     public double getPerimeter(){
         return 2*radius*Math.PI;
     }
     @Override
    public String toString(){
         return "radius ="
                 +getRadius(radius)
                 +"and color is "
                 +getColor(color);
     }
}
