package numericExer.n1_5;

import java.util.ArrayList;
import java.util.List;

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

    public float getGPA(){
        float sum = 0;

        for (Integer mark : marks) {
            sum += mark;
        }

        return sum / marks.size();
    }

    public String isGood(){
        if (getGPA() < 5) {
            return "не является отличником";
        }
        return "является отличником";
    }

    public String toString(){
        String marks = "";
        for (int m: this.marks) {
            marks += m + ", ";//todo разобраться в StringBuilder
        }
        return "Ученик " + name + ", его оценки: " + marks + isGood();
    }
}
