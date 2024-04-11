package numericExer.n3_2.n4;

import numericExer.n1_4.Point;

public abstract class Figure {
    protected Point mainPoint;

    public Figure(Point mainPoint){
        this.mainPoint = mainPoint;
    }

    public Point getMainPoint(){
        return new Point(mainPoint);
    }

    public void setMainPoint(Point newPoint){
        mainPoint = newPoint;
    }

    abstract double getArea();

    abstract double getLength();

    public String toString(){
        return "Площадь: " + getArea() + "\nПериметр: " + getLength();
    }
}
