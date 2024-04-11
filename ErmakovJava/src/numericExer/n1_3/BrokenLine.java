package numericExer.n1_3;

import numericExer.n1_1.Point;

import java.util.ArrayList;
import java.util.Arrays;

public class BrokenLine {
    ArrayList<Point> points;

    public BrokenLine(Point...points){
        this.points = new ArrayList<>();
        this.points.addAll(Arrays.asList(points));
    }

    public String toString(){
        String points = "";
        for (Point p: this.points) {
            points += p;
        }

        return "Линия: [" + points + "]";
    }
}
