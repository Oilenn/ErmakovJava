package numericExer.n1_6;
import numericExer.n1_4.Point;
import numericExer.n1_5.BrokenLine;

public class Square {
    Point leftPoint;
    private int length;

    public Square(Point leftPoint, int length){
        this.leftPoint = leftPoint;
        if(length < 1) {
            throw new IllegalArgumentException("Сторона квадрата должна быть больше 1!");
        }
        this.length = length;
    }

    public void setLength(int newLength){
        if(newLength < 1){
            throw new IllegalArgumentException("Сторона квадрата должна быть больше 1!");
        }
        length = newLength;
    }

    public int getLength(){
        return length;
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
