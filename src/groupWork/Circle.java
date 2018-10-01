package groupWork;

import java.lang.Math.*;

public class Circle {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}
