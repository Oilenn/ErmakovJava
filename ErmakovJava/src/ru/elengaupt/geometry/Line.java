package ru.elengaupt.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line<T extends Point> implements Measurable, Polygonable{
    private T start, end;

    public Line(T start, T end){
        if(start == end){
            throw new IllegalArgumentException("Точки линии должны быть разными!");
        }
        this.start = start;
        this.end = end;
    }

    public void setStart(T start){
        this.start = start;
    }

    public void setEnd(T end){
        this.end = end;
    }

    public Point getEnd(){
        return new Point(end.x, end.y);
    }

    public Point getStart(){
        return new Point(start.x, start.y);
    }

    public double getLength(){
        return sqrt(pow((end.x - start.x), 2) + pow((end.y - start.y), 2));
    }

    public Line(int x1, int y1, int x2, int y2){
        this((T)new Point(x1, y1), (T)new Point(x2, y2));
    }

    public String toString(){
        return "Линия от " + start.toString() + " до " + end.toString();
    }

    @Override
    public boolean equals(Object line){
        if(line.getClass() != Line.class) return false;
        return start == ((Line) line).start &&
                end == ((Line) line).end;
    }

    @Override
    public BrokenLine getBrokenLine() {
        return new BrokenLine(new Point(start), new Point(end));
    }
}
