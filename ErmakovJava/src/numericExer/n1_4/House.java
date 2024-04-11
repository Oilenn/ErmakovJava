package numericExer.n1_4;

public class House {
    private final int floors;
    
    public House(int floors){
        this.floors = floors;
    }
    
    public String toString(){
        int lastNum = 0;
        String strFloors = " этажей";

        for(int i = floors; i > 0; i /= 10){
            lastNum = i % 10;
        }
        //0 - этажей
        //1 - этаж
        //2, 3, 4, 5, 6, 7, 8, 9
        //
        if(lastNum == 1){
            strFloors = " этаж";
        }
        else if(lastNum > 1){
            strFloors = " этажами";
        }

        return "Дом с " + floors + strFloors;
    }

    /*public int changeFloors(int newFloors){
        this.floors = newFloors;
    }*/
}
