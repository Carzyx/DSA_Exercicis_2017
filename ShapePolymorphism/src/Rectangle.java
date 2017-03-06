/**
 * Created by histo on 05/03/2017.
 */
public class Rectangle extends Shape {

    private double x;
    private double y;

    public Rectangle(double x, double y, String name) {
        super(name);
        this.x = x;
        this.y = y;
    }

    public void calculateArea()
    {
        double area = x * y;
        calculateArea(area);
    }

    public void calculatePerimeter()
    {
        double perimeter = 2*(x+y);
        calculatePerimeter(perimeter);
    }

    public String getArea()
    {
        return super.getArea();
    }

    public String getPerimeter()
    {
        return super.getPerimeter();
    }

}