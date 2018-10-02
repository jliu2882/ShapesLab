package groupWork;

public class ETriangle extends Shape{
    private double side;

    public ETriangle(int side) {
        super("ETriangle");
        this.side = side;
    }

    public double getArea()
    {
        return (Math.sqrt(3)/4) * this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 3;
    }
}

