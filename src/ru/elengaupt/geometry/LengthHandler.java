package ru.elengaupt.geometry;

public class LengthHandler {
    public double getManyLength(Measurable...objects){
        double result = 0;

        for(int i = 0; i < objects.length; i++){
            result += objects[i].getLength();
        }

        return result;
    }
}
