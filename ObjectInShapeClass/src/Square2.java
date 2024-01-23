public class Square2 extends Rectangle {
    public Square2() {
    }

    public Square2(double side) {
        super(side, side);
    }

    public Square2(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square2 with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}