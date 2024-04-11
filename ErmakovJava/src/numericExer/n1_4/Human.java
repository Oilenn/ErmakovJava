package numericExer.n1_4;

import numericExer.n1_2.Name;

public class Human {
    numericExer.n1_2.Name name;
    int height;
    private Human father;
    public Human(Name name, int height, Human father){
        this.name = name;
        this.height = height;
        this.father = father;
        if(father != null) {
            name.changeNameByFather(father.name);
        }
    }
    public Human(Name name, int height) {
        this(name, height, null);
    }

    public Human(String name, int height, Human father) {
        this(new Name(name), height, father);
    }

    public void setFather(Human father){
        this.father = father;
        name.changeNameByFather(father.name);
    }

    public String toString(){
        return "Человек " + name + " и ростом " + height + (father != null ? ", отец - " + father.name : "");
    }
}
