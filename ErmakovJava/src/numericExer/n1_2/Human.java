package numericExer.n1_2;

public class Human {
    Name name;
    int height;
    private Human father;

    public Human(Name name, int height) {
        this(name, height, null);
    }

    public Human(Name name, int height, Human father){
        this.name = name;
        this.height = height;
        this.father = father;
        if(father != null) {
            name.changeNameByFather(father.name);
        }
    }

    public void setFather(Human father){
        this.father = father;
        name.changeNameByFather(father.name);
    }

    public String toString(){
        return "Человек " + name + " и ростом " + height + (father != null ? ", отец - " + father.name : "");
    }
    /*public Human(String name, String surname, String fatherName){
        this.name = new Name(name, surname, fatherName);
    }*/
}
