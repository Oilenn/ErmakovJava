package numericExer.n1_4;

public class Point {
    public int x,y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point copyPoint){
        this.x = copyPoint.x;
        this.y = copyPoint.y;
    }

    public String toString(){
        return "{" + x + ";" + y + "}";
    }
}
