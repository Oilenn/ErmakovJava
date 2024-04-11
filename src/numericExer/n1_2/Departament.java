package numericExer.n1_2;

public class Departament {
    String name;
    Staff boss;

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
