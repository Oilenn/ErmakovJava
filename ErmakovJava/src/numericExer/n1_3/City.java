package numericExer.n1_3;

import java.util.HashMap;
import java.util.Map;

public class City {
    String name;
    Map<City,Integer> cityNodes = new HashMap<City,Integer>();

    public City(String name, Map<City,Integer> cityNodes){
        this.name = name;
        this.cityNodes = cityNodes;
    }

    public City(String name){
        this(name, new HashMap<City,Integer>());
    }

    public void AddCityNode(City city, int cost){
        cityNodes.put(city, cost);
    }

    public void AddTwoSidedNode(City city, int cost){
        AddCityNode(city, cost);
        city.AddCityNode(this, cost);
    }

    public String getCityNodes(){
        String nodesList = "";

        for(Map.Entry<City, Integer> entry : cityNodes.entrySet()){
            nodesList += entry.getKey().name + ":" + entry.getValue() + "\n";
        }

        return nodesList;
    }

    public String toString(){
        return name;
    }
}
