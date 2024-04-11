package ru.elengaupt.geometry;

import java.util.ArrayList;
import java.util.List;

public abstract class Figure {
    protected Point mainPoint;

    protected List<Point> points = new ArrayList<Point>();

    public static double getSumArea(Figure...figures){
        double result = 0;

        for(int i = 0; i < figures.length; i++){
            result += figures[i].getArea();
        }

        return result;
    }

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
