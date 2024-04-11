package ru.elengaupt.temperature;

public class Temperature {
    private TemperatureState temperatureState = TemperatureState.Hot;
    private int degrees;

    public Temperature(int degrees){
        if(degrees < -50 || degrees > 60){
            throw new IllegalArgumentException();
        }

        this.degrees = degrees;
    }
}

