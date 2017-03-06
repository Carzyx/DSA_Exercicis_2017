/**
 * Created by histo on 05/03/2017.
 */
public class Circle extends Shape {
    private double r;

    public Circle(double r, String name) {
        super(name);
        this.r = r;
    }
    public void calculateArea()
    {
        double area = Math.pow(Math.PI*r, 2);
        calculateArea(area);
    }

    public void calculatePerimeter()
    {
        double perimeter = 2*Math.PI*r;
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

