package ru.elengaupt.geometry;

public class PointBuilder {
    private ThreeDimensionalPoint point;

    public PointBuilder setX(int x){
        point.x = x;
        return this;
    }

    private PointBuilder setY(int y){
        point.y = y;
        return this;
    }

    private PointBuilder setZ(int z){
        point.z = z;
        return this;
    }

    public Point build(){
        return point;
    }

}
