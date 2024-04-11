package ru.elengaupt;

public class Storage<T>{
    private final T object;

    private Storage(T object){
        this.object = object;
    }

    public static Storage createStorage(){
        return null;
    }

    public Storage createStorage(T object){
        return new Storage(object);
    }

    public T getObject(T alternative){
        if(object != null) return object;
        //else if(alternative == null) return T;
        else return alternative;
    }
}
