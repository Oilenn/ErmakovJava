package numericExer.n1_2;
import numericExer.n1_1.Point;
public class Line {
    Point start, end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public String toString(){
        return "Линия от " + start.toString() + " до " + end.toString();
    }
}
