package numericExer.n3_2.n4;

import numericExer.n1_4.Point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle extends Figure{

    private Point point2, point3;

    public Triangle(Point point1, Point point2, Point point3){
        super(point1);
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    double getArea() {
        double p = getLength();

        double a = sqrt(pow((point2.x - mainPoint.x), 2) + pow((point2.y - mainPoint.y), 2));
        double b = sqrt(pow((point3.x - point2.x), 2) + pow((point3.y - point2.y), 2));
        double c = sqrt(pow((mainPoint.x - point3.x), 2) + pow((mainPoint.y - point3.y), 2));

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double getLength() {
        double line1 = sqrt(pow((point2.x - mainPoint.x), 2) + pow((point2.y - mainPoint.y), 2));
        double line2 = sqrt(pow((point3.x - point2.x), 2) + pow((point3.y - point2.y), 2));
        double line3 = sqrt(pow((mainPoint.x - point3.x), 2) + pow((mainPoint.y - point3.y), 2));

        return line1 + line2 + line3;
    }
}
