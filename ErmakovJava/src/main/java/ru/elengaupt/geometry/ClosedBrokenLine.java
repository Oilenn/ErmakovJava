package ru.elengaupt.geometry;

public class ClosedBrokenLine extends BrokenLine implements Measurable{

    public ClosedBrokenLine(Point...points){
        super(points);
        this.points.add(this.points.get(this.points.size() - 1));
    }

    public double getLength(){
        return super.getLength() + getLineLenght(points.get(0), points.get(points.size() - 1));
    }
}
