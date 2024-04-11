package numericExer.n1_6;

import java.util.HashMap;
import java.util.Map;

public class City {
    protected String name;
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
