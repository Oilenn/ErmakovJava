package numericExer.n3_2.n5;

import numericExer.n1_4.Point;
import numericExer.n1_4.Time;
import numericExer.n3_1.ThreeDimensionalPoint;

public class PointDec {
    private Point point;

    private String color;

    private Time time;

    public PointDec(Point point, Time time, String color){
        this.point = point;
        this.time = time;
        this.color = color;
    }

    public PointDec(ThreeDimensionalPoint point){
        this(point, null, null);
    }

    public PointDec(ThreeDimensionalPoint point, Time time){
        this(point, time, null);
    }

    public PointDec(ThreeDimensionalPoint point, String color){
        this(point, null, color);
    }

    public String toString(){
        String info = "Точка в координате " + point;

        if(color != null){
            info += ", " + color + " цвета";
        }
        if(time != null){
            info += " в " + time;
        }

        return info;
    }
}
