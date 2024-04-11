package ru.elengaupt.temperature;

import java.util.ArrayList;
import java.util.List;

public class TemperatureCreator {
    private static TemperatureCreator instance;
    private List<Temperature> temperatures;

    private TemperatureCreator(){
        temperatures = new ArrayList<Temperature>();
    }

    public static TemperatureCreator getInstance() {
        if(instance == null) {
            return new TemperatureCreator();
        }
        return instance;
    }

    public Temperature createTemperature(int degrees){
        Temperature temperature = new Temperature(degrees);
        temperatures.add(temperature);
        return temperature;
    }

    public List<Temperature> getTemperatures(){
        return temperatures;
    }
}
