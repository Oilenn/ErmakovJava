package numericExer.n1_4;

import java.util.ArrayList;
import java.util.Arrays;

public class BrokenLine {
    ArrayList<numericExer.n1_4.Point> points = new ArrayList<>();

    public BrokenLine(numericExer.n1_4.Point...points){
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
