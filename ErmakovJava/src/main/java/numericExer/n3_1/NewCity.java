package numericExer.n3_1;

import numericExer.n1_6.City;

import java.util.Map;

public class NewCity extends numericExer.n1_6.City{
    public NewCity(String name, Map<City, Integer> cityNodes) {
        super(name, cityNodes);
    }

    @Override
    public void addCityNode(City city, int cost) {
        cityNodes.put(city, cost);
        if (!city.getNodes().containsKey(this)) {
            city.addCityNode(this, cost);
        }
    }
}
