package numericExer.n3_2.n4;
import numericExer.n1_4.Point;
import numericExer.n1_5.BrokenLine;

public class Square extends Figure{
    private int length;

    public Square(Point leftPoint, int length){
        super(leftPoint);
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

    public double getLength(){
        return length;
    }

    public double getArea(){
        return length * 2;
    }

    public Square(int leftX, int leftY, int length){
        this(new Point(leftX, leftY), length);
    }

    public String toString() {
        return "Квадрат в точке " + mainPoint + " со стороной " + length;
    }

    public BrokenLine convertToBrokenLine(){
        return new BrokenLine(mainPoint,
                              new Point(mainPoint.x, mainPoint.y + length),
                              new Point(mainPoint.x + length, mainPoint.y + length),
                              new Point(mainPoint.x + length, mainPoint.y));
    }
}
