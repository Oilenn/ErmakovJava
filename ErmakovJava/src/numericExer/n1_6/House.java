package numericExer.n1_6;

public class House {
    private final int floors;

    public House(int floors){
        if(floors < 1){
            throw new IllegalArgumentException();
        }
        this.floors = floors;
    }

    public String toString(){
        int lastNum = 0;
        String strFloors = " этажей";

        for(int i = floors; i > 0; i /= 10){
            lastNum = i % 10;
        }
        if(lastNum == 1){
            strFloors = " этаж";
        }
        else if(lastNum > 1){
            strFloors = " этажами";
        }

        return "Дом с " + floors + strFloors;
    }
}
