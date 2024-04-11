package ru.elengaupt.human;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    String name;
    private List<Integer> marks;

    public Student(String name, List<Integer> marks){
        this.marks = marks;
        this.name = name;
    }

    public Student(String name){
        this(name, new ArrayList<Integer>());
    }

    public void addMark(int mark){
        if(mark < 2 || mark > 5){
            throw new IllegalArgumentException("Оценки не могут быть больше 5 или меньше 2!");
        }
        marks.add(mark);
    }

    public List<Integer> getMarks(){
        return new ArrayList<Integer>(marks);
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

    @Override
    public int compareTo(Student o) {
        if(this.getGPA() > o.getGPA()){
            return 1;
        }
        else if(this.getGPA() == o.getGPA()){
            return 0;
        }
        else{
            return -1;
        }
    }
}
