package numericExer.n1_4;

import numericExer.n1_1.Point;

import java.util.ArrayList;
import java.util.Arrays;

public class BrokenLine {
    ArrayList<Point> points = new ArrayList<>();

    public BrokenLine(Point...points){
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
