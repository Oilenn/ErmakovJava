package numericExer.n1_5;

import numericExer.n1_4.Point;

import java.util.ArrayList;
import java.util.List;

public class Ermakov_Ex1_5 {
    public static void main(String[] args){
        n1_8();
    }

    public static void n1_1() {
        Gun gun = new Gun(3);
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();
    }

    public static void n1_2(){
        Cat cat = new Cat("Барсик");
        cat.meow();
        cat.meowMany(3);
    }

    public static void n1_3(){
        Line line = new Line(new numericExer.n1_1.Point(1,1), new numericExer.n1_1.Point(10,15));

        System.out.println(line.getLenght());
    }

    public static void n1_4(){
        Time time1 = new Time(34056);
        Time time2 = new Time(4532);
        Time time3 = new Time(123);

        System.out.println(time1.getHour());
        System.out.println(time2.getMinutes());
        System.out.println(time3.getSeconds());
    }

    public static void n1_5(){
        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(2,3);
        Fraction f3 = new Fraction(1,9);

        System.out.println(f1.sum(f2).divide(f3).subtract(5));
    }

    public static void n1_6(){
        Student student = new Student("Саша", new ArrayList<Integer>(List.of(3,3,5,3)));
        Student student2 = new Student("Ваня", new ArrayList<Integer>(List.of(5,5,5,5)));

        System.out.println(student);
        System.out.println(student2);
    }

    public static void n1_7(){
        BrokenLine brokenLine = new BrokenLine(new Point(1,5), new Point(2,8), new Point(5,3));

        System.out.println(brokenLine.getLenght());

        brokenLine.addDot(new Point(5,15));
        brokenLine.addDot(new Point(8,10));

        System.out.println(brokenLine.getLenght());
    }

    public static void n1_8(){
        Square square = new Square(new Point(1,3), 5);
        BrokenLine brokenLine = square.convertToBrokenLine();
        System.out.println(brokenLine.getLenght());
        brokenLine.addDot(new Point(15,25));
        System.out.println(brokenLine.getLenght());
    }
}
