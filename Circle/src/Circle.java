 class Circle {
      double  radius;
     String color;

    public Circle(){
        radius = 1;
        color = "red";
    }
    Circle(double r){
        this.radius = r;
        color ="red";
    }
      public  double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*2 * Math.PI;
    }
}
 class TestCircle {
     public static void main(String[] args) {
         Circle circle = new Circle(5);
         System.out.println("Radius" + circle.getRadius());
     }
 }



