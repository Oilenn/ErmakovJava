package ru.elengaupt.cities;

import ru.elengaupt.math.Fraction;

import java.util.HashMap;
import java.util.Map;

public class City {
    public String name;
    protected Map<City, Integer> cityNodes = new HashMap<City,Integer>();

    public City(String name, Map<City,Integer> cityNodes){
        this.name = name;
        this.cityNodes = cityNodes;
    }

    public City(String name){
        this(name, new HashMap<City,Integer>());
    }

    public void addCityNode(City city, int cost){
        cityNodes.put(city, cost);
    }

    public void removeCityNode(City city){
        cityNodes.remove(city);
    }

    //public void addTwoSidedNode(City city, int cost){
    //    addCityNode(city, cost);
    //    city.addCityNode(this, cost);
    //}

    @Override
    public boolean equals(Object city){
        if(city.getClass() != City.class) return false;

        return ((City) city).getNodes().equals(this.cityNodes);
    }

    public String getStringNodes(){
        String nodesList = "";

        for(Map.Entry<City, Integer> entry : cityNodes.entrySet()){
            nodesList += entry.getKey().name + ":" + entry.getValue() + "\n";
        }

        return nodesList;
    }

    public HashMap<City,Integer> getNodes(){
        return new HashMap<City,Integer>(cityNodes);
    }

    public String toString(){
        return name;
    }
}
