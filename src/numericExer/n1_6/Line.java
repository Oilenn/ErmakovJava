package numericExer.n1_6;

import numericExer.n1_1.Point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line {
    private Point start, end;

    public Line(Point start, Point end){
        if(start == end){
            throw new IllegalArgumentException("Точки линии должны быть разными!");
        }
        this.start = start;
        this.end = end;
    }

    public void setStart(Point start){
        this.start = start;
    }

    public void setEnd(Point end){
        this.end = end;
    }

    public Point getEnd(){
        return new Point(end.x, end.y);
    }

    public Point getStart(){
        return new Point(start.x, start.y);
    }

    public double getLenght(){
        return sqrt(pow((end.x - start.x), 2) + pow((end.y - start.y), 2));
    }

    public Line(int x1, int y1, int x2, int y2){
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public String toString(){
        return "Линия от " + start.toString() + " до " + end.toString();
    }
}
