package numericExer.n1_5;

import numericExer.n1_4.Point;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class BrokenLine {
    protected ArrayList<Point> points = new ArrayList<>();

    public BrokenLine(Point...points){
        this.points.addAll(Arrays.asList(points));
    }

    public double getLenght(){
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
}
