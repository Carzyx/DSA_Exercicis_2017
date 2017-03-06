import java.util.List;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(3.0, "cuadrado");
        Rectangle rectangle = new Rectangle(2.0, 3.0, "rectangulo");
        Circle circle = new Circle(5.0, "circulo");

        square.calculatePerimeter();
        System.out.println(square.getPerimeter());

        square.calculateArea();
        System.out.println(square.getArea());

        rectangle.calculatePerimeter();
        System.out.println(rectangle.getPerimeter());

        rectangle.calculateArea();
        System.out.println(rectangle.getArea());

        circle.calculatePerimeter();
        System.out.println(circle.getPerimeter());

        circle.calculateArea();
        System.out.println(circle.getArea());
    }
}
