package numericExer.n1_5;
import numericExer.n1_4.Point;

public class Square {
    Point leftPoint;
    int length;

    public Square(Point leftPoint, int length){
        this.leftPoint = leftPoint;
        this.length = length;
    }

    public Square(int leftX, int leftY, int length){
        this(new Point(leftX, leftY), length);
    }

    public String toString() {
        return "Квадрат в точке " + leftPoint + " со стороной " + length;
    }

    public BrokenLine convertToBrokenLine(){
        return new BrokenLine(leftPoint,
                              new Point(leftPoint.x, leftPoint.y + length),
                              new Point(leftPoint.x + length, leftPoint.y + length),
                              new Point(leftPoint.x + length, leftPoint.y));
    }
}
