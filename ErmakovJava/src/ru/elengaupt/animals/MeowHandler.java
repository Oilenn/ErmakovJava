package ru.elengaupt.animals;

public class MeowHandler {
    public void meowMany(Meowable...meowers){
        for(int i = 0; i < meowers.length; i++){
            meowers[i].meow();
        }
    }
}
