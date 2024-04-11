package numericExer.n3_2;


import numericExer.n1_4.Point;
import numericExer.n1_4.Time;
import numericExer.n3_1.ThreeDimensionalPoint;
import numericExer.n3_2.n1.Gun;
import numericExer.n3_2.n2.Fraction;
import numericExer.n3_2.n3.Bird;
import numericExer.n3_2.n3.Parrot;
import numericExer.n3_2.n4.Circle;
import numericExer.n3_2.n4.Figure;
import numericExer.n3_2.n5.PointDec;

public class Ermakov_Ex3_2 {
    public static void main(String[] args){
        n3_4();
    }

    public static void n3_1(){
        Gun gun = new Gun();

        gun.shoot();
    }

    public static void n3_2(){
        Fraction fr = new Fraction(3,55215);

        System.out.println(fr.floatValue());
    }

    public static void n3_3(){
        Bird br1 = new Parrot("Здраствуйте Александр Вадимович");
        br1.sing();
    }

    public static void n3_4(){
        Figure figure = new Circle(new Point(5,2), 35);

        System.out.println(figure);
    }

    public static void n3_5(){
        PointDec pointDec = new PointDec(new ThreeDimensionalPoint(3,12,2), new Time(322));

        System.out.println(pointDec);
    }
}
