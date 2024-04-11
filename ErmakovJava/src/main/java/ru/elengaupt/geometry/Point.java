package ru.elengaupt.geometry;

public class Point {
    public int x,y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }

    @Override
    public boolean equals(Object point){
        if(point.getClass() != Point.class) return false;
        return x == ((Point) point).x &&
               x == ((Point) point).y;
    }

    public String toString(){
        return "{" + x + ";" + y + "}";
    }
}
