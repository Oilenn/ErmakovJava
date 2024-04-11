package ru.elengaupt.animals;

public class Dog implements Woofable{
    private String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Собака: " + name;
    }

    @Override
    public void woof() {
        System.out.println(name + ": Гав!");
    }
}
