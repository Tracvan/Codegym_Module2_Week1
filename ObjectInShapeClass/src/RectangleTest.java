
class RectangleTest{

    public static void main(String[] args) {
        Rectangle Rectangle = new Rectangle();
        System.out.println(Rectangle);

        Rectangle = new Rectangle(2.3, 5.8);
        System.out.println(Rectangle);

        Rectangle = new Rectangle(2.5,3.8, "orange", false);
        System.out.println(Rectangle);
    }
}