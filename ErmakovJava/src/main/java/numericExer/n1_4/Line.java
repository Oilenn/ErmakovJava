package numericExer.n1_4;

public class Line {
    numericExer.n1_4.Point start, end;

    public Line(numericExer.n1_4.Point start, numericExer.n1_4.Point end){
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2){
        this(new numericExer.n1_4.Point(x1, y1), new Point(x2, y2));
    }

    public String toString(){
        return "Линия от " + start.toString() + " до " + end.toString();
    }
}
