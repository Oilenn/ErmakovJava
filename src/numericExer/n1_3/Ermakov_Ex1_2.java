package numericExer.n1_3;

import numericExer.n1_1.Point;

import java.util.ArrayList;
import java.util.List;

public class Ermakov_Ex1_2 {
    public static void main(String[] args) {
        n3_3();
    }

    public static void n3_1(){
        Student student1 = new Student("Вася",new ArrayList<Integer>(List.of(3,3,5,3)));

        Student student2 = new Student("Петя", student1.marks);
        student2.marks.set(0, 5);
        System.out.println(student1);
        System.out.println(student2);

    }

    public static void n3_2(){
        BrokenLine brokenLine = new BrokenLine(new Point(5,5), new Point(6,3), new Point(11,55));

        System.out.println(brokenLine);
    }

    public static void n3_3(){
        City cityA = new City("A");
        City cityB = new City("B");
        City cityC = new City("C");
        City cityD = new City("D");
        City cityE = new City("E");
        City cityF = new City("F");

        cityA.AddTwoSidedNode(cityB, 5);
        cityA.AddCityNode(cityE,12);
        System.out.println(cityA.getCityNodes());
    }
}


