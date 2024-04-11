package ru.elengaupt.geometry;

public class Circle extends Figure implements Measurable{
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


    public double getLength() {
        return Math.PI * radius * 2;
    }
}
