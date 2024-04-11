package ru.elengaupt.geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class BrokenLine implements Measurable{
    protected ArrayList<Point> points = new ArrayList<>();

    public BrokenLine(Point...points){
        this.points.addAll(Arrays.asList(points));
    }

    public BrokenLine(List<Point> pointList){
        this.points.addAll(pointList);
    }

    public BrokenLine(BrokenLine brokenLine){
        this.points.addAll(brokenLine.getPoints());
    }

    public double getLength(){
        double lenght = 0;

        for(int i = 1; i < points.size(); i++){
            lenght += getLineLenght(points.get(i),points.get(i - 1));
        }

        return lenght;
    }

    public double getLineLenght(Point point1, Point point2){
        return sqrt(pow((point2.x - point1.x), 2) +
                pow((point2.y - point1.y), 2));
    }

    public List<Point> getPoints(){
        return new ArrayList<Point>(points);
    }

    public void addDot(Point point){
        points.add(point);
    }

    public String toString(){
        String points = "";
        for (Point p: this.points) {
            points += p;
        }

        return "Линия: [" + points + "]";
    }

    @Override
    public boolean equals(Object brokenLine){
        if(brokenLine.getClass() != BrokenLine.class) return false;

        return this.points.equals(((BrokenLine) brokenLine).points);
    }

    public BrokenLine getBrokenLine(){
        return new BrokenLine(this);
    }
}
