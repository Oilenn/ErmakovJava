package numericExer.n3_2.n4;

import numericExer.n1_4.Point;

public class Circle extends Figure{
    private double radius;

    public Circle(Point mainPoint, double radius){
        super(mainPoint);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius){
        if(radius <= 0) throw new IllegalArgumentException();
        radius = newRadius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getLength() {
        return Math.PI * radius * 2;
    }
}
