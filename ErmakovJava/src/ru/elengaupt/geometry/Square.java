package ru.elengaupt.geometry;

public class Square extends Rectangle{
    private int length;

    public Square(Point leftPoint, int length){
        super(leftPoint, length, length);
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

    public ClosedBrokenLine convertToBrokenLine(){
        return new ClosedBrokenLine(mainPoint,
                                    new Point(mainPoint.x, mainPoint.y + length),
                                    new Point(mainPoint.x + length, mainPoint.y + length));
    }
}
