package numericExer.n1_2;

public class Staff {
    String name;
    Departament departament;

    public Staff(String name, Departament departament){
        this.name = name;
        this.departament = departament;
    }

    public Staff(String name){
        this(name, null);
    }

    //???
    public Staff(Departament departament){
        this(null, departament);
    }

    public String toString(){
        if(departament.boss != this) return name + " работает в отделе " + departament.name + ", начальник которого " + departament.getBossName();
        else return name + " является начальником отдела " + departament.name;
    }
}
