/**
 * Created by histo on 05/03/2017.
 */
public abstract class Shape implements IShape {
    public String shapeName;

    public double area;
    public double perimeter;

    protected String message;

    public Shape(String name)
    {
        shapeName = name;
    }

    protected void calculateArea(double area)
    {
        this.area = area;
    }

    protected void calculatePerimeter(double perimeter)
    {
        this.perimeter = perimeter;
    }

    public String getArea()
    {
        String message = "Area of "+shapeName+" = "+String.valueOf(area);
        return message;

    }
    public String getPerimeter()
    {
        String message = "Perimeter of "+shapeName+" = "+String.valueOf(perimeter);
        return message;
    }


}
