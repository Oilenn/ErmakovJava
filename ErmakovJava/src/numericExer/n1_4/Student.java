package numericExer.n1_4;

import java.util.*;
public class Student {
    String name;
    List<Integer> marks;

    public Student(String name, List<Integer> marks){
        this.marks = marks;
        this.name = name;
    }

    public Student(String name){
        this(name, new ArrayList<Integer>());
    }

    public String toString(){
        String marks = "";
        for (int m: this.marks) {
            marks += m + ",";//todo разобраться в StringBuilder
        }
        return "Ученик " + name + ", его оценки: " + marks;
    }
}
