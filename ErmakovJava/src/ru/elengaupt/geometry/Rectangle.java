package ru.elengaupt.geometry;

public class Rectangle extends Figure implements Measurable, Polygonable{
    protected double a, b;

    public Rectangle(Point mainPoint, double a, double b){
        super(mainPoint);
        setA(a);
        setB(b);
        points.add(new Point(mainPoint));
        points.add(new Point((int)(mainPoint.x + a), mainPoint.y));
        points.add(new Point(mainPoint.x, (int)(mainPoint.y - b)));
        points.add(new Point((int)(mainPoint.x + a), (int)(mainPoint.y - b)));
        points.add(points.get(0));
    }

    public void setA(double a){
        if(a <= 0) throw new IllegalArgumentException();
        this.a = b;
    }

    public void setB(double b){
        if(b <= 0) throw new IllegalArgumentException();
        this.b = b;
    }

    public double getA(double a){
        return a;
    }

    public double getB(double b){
        return b;
    }

    public double getArea(){
        return a * b;
    }

    @Override
    public double getLength() {
        return (a + b) * 2;
    }

    @Override
    public BrokenLine getBrokenLine() {
        return new BrokenLine(points);
    }
}
