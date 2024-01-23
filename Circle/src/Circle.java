 class Circle {
      double  radius;
     String color;

    public Circle(){
        radius = 1;
        color = "red";
    }
    Circle(double r){
        this.radius = r;
    }
    Circle(double r, String color){
        this.radius = r;
        this.color = color;
    }
      public  double getRadius(){

        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){

        return radius*2 * Math.PI;
    }
}
 class TestCircle {
     public static void main(String[] args) {
         Circle circle = new Circle(5);
         System.out.println("Radius" + circle.getRadius());
         circle = new Circle(5,"red");
         System.out.println("Radius" + circle.getRadius());
     }
 }



