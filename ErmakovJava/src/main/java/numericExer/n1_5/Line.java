package numericExer.n1_5;

import numericExer.n1_1.Point;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class Line {
    Point start, end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
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
