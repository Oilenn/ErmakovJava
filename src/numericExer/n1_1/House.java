package numericExer.n1_1;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oilen
 */
public class House {
    int floors;
    
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
}
