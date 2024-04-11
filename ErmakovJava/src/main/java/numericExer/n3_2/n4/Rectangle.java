package numericExer.n3_2.n4;

import numericExer.n1_4.Point;

public class Rectangle extends Figure {
    private double a, b;

    public Rectangle(Point mainPoint, double a, double b){
        super(mainPoint);
        setA(a);
        setB(b);
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
}
