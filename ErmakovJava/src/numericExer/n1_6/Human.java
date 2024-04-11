package numericExer.n1_6;

public class Human {
    Name name;
    private int height;
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

    public Human getFather(){
        return new Human(father.name, father.getHeight(), father.getFather());
    }

    public int getHeight(){
        return height;
    }

    public String toString(){
        return "Человек " + name + " и ростом " + height + (father != null ? ", отец - " + father.name : "");
    }
}
