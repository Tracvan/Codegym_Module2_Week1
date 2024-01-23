public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    Rectangle(){
    }
     Rectangle(double width, double length){
        this.length =length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length =length;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
         this.width = width;
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

    public static class Shape {
        String color = "green";
        boolean filled = true;
        Shape(){
        }

        Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean getFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public boolean isFilled() {
            return filled;
        }

        public String toString() {
            return "A shape with color of "
                    + getColor()
                    +" and "
                    + (isFilled() ? "filled" : "not filled");
        }
    }
}

