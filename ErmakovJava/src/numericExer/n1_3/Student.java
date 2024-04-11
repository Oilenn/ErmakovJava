package numericExer.n1_3;

import java.util.*;

public class Student {
    String name;
    List<Integer> marks;

    public Student(String name, List<Integer> marks){
        this.marks = marks;
        this.name = name;
    }


    public String toString(){
        String marks = "";
        for (int m: this.marks) {
            marks += m + ",";//todo разобраться в StringBuilder
        }
        return "Ученик " + name + ", его оценки: " + marks;
    }
}
