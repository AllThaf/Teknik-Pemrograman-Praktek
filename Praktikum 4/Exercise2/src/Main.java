public class Main {
        public static void main(String[] args) throws Exception {
                Shape shape1 = new Shape();
                Shape shape2 = new Shape("Blue", false);
                Circle circle = new Circle(7.0);
                Rectangle rectangle = new Rectangle(2.5, 9.72, "Black", false);
                Square square = new Square(10.0);

                System.out.println(shape1.toString());
                System.out.println(shape2.toString());
                System.out.println(circle.toString() + ". Area = " + circle.getArea() + " Perimeter = "
                                + circle.getPerimeter());
                System.out.println(rectangle.toString() + ". Area = " + rectangle.getArea() + " Perimeter = "
                                + rectangle.getPerimeter());
                System.out.println(square.toString() + ". Area = " + square.getArea() + " Perimeter = "
                                + square.getPerimeter());
        }
}
