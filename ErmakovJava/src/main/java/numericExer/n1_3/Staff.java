package numericExer.n1_3;

import java.util.ArrayList;

public class Staff {
    String name;
    Departament departament;

    public Staff(String name, Departament departament){
        this.name = name;
        setDepartament(departament);
    }

    public void setDepartament(Departament departament){
        this.departament = departament;
        departament.staff.add(this);
    }

    public Staff(String name){
        this(name, null);
    }

    //???
    public Staff(Departament departament){
        this(null, departament);
    }

    public ArrayList<Staff> getDepartamentStaff(){
        return new ArrayList<Staff>(departament.staff);
    }

    public String toString(){
        if(departament.boss != this) return name + " работает в отделе " + departament.name + ", начальник которого " + departament.getBossName();
        else return name + " является начальником отдела " + departament.name;
    }
}
