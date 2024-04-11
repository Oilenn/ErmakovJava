package numericExer.n3_1;

import numericExer.n1_4.Point;

public class ThreeDimensionalPoint extends Point {
    public int z;

    public ThreeDimensionalPoint(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public String toString(){
        return "{" + x + ";" + y + ";" + z + "}";
    }
}