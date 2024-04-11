package ru.elengaupt.animals;

public class BirdMarket {
    public BirdMarket(){
    }

    public void makeSing(Bird...birds){
        for(int i = 0; i < birds.length; i++){
            birds[i].sing();
        }
    }
}
