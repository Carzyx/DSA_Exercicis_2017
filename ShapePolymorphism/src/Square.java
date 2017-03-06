/**
 * Created by histo on 05/03/2017.
 */
public class Square extends Shape{

    private double x;

    public Square(double x, String name) {
        super(name);
        this.x = x;
    }

    public void calculateArea()
    {
        double area = x * x;
        calculateArea(area);
    }

    public void calculatePerimeter()
    {
        double perimeter = 4*x;
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

