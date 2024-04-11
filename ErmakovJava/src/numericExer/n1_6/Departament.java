package numericExer.n1_6;

public class Departament {
    String name;
    private Staff boss;

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

    public void setBoss(Staff boss){
        boss.departament = this;
        this.boss = boss;
    }

    public Staff getBoss(){
        return new Staff(boss.name, this);
    }

    public String getBossName(){
        return boss.name;
    }
}
