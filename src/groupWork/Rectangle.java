package groupWork;

public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(int width, int height)
    {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }
    public double getArea()
    {
        return this.width*this.height;
    }
    public double getPerimeter()
    {
        return 2*(this.height + this.width);
    }
}
