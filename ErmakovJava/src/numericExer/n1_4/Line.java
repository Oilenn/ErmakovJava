package numericExer.n1_4;

import numericExer.n1_1.Point;

public class Line {
    Point start, end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2){
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public String toString(){
        return "Линия от " + start.toString() + " до " + end.toString();
    }
}
