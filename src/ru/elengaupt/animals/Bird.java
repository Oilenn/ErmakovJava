package ru.elengaupt.animals;

public abstract class Bird {
    protected final String phrase;

    protected Bird(String phrase){
        this.phrase = phrase;
    }

    public abstract void sing();
}
