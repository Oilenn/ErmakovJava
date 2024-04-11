package numericExer.n1_3;

import java.util.ArrayList;

public class Departament {
    String name;
    Staff boss;
    ArrayList<Staff> staff = new ArrayList<Staff>();
    public Departament(String name, Staff boss){
        this.name = name;
        this.boss = boss;
    }

    public Departament(String name){
        this(name, null);
    }
    //???
    public Departament(Staff boss){
        this(null, boss);
    }

    public String getBossName(){
        return boss.name;
    }
}
