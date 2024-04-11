package ru.elengaupt.animals;

public class Cat implements Meowable {
    String name;

    public Cat(String name){
        this.name = name;
    }

    public String toString(){
        return "Кот:" + name;
    }

    public void meow(){
        System.out.println(name + ": мяу!" + "\n");
    }

    public void meowMany(int count){
        String meowStr = name + ": ";

        for(int i = count; i>0; i--){
            if(i > 1) {
                meowStr += "мяу-";
            }
            else{
                meowStr += "мяу!";
            }
        }

        System.out.println(meowStr);
    }
}
