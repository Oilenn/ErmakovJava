package ru.elengaupt;

public class Box<T>{
    private T object;

    public void setObject(T object){
        if(!containsObject()) this.object = object;
        else throw new IllegalArgumentException();
    }

    public boolean containsObject(){
        return object != null;
    }

    public T getObject(){
        return object;
    }
}
