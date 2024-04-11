package numericExer.n1_1;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oilen
 */
public class Time {
    int seconds;
    
    public Time(int secondsPassed){
        this.seconds = secondsPassed;
    }
    //362532
    public String getString(){
        int hours = seconds / 3600;
        int minutes = (seconds - hours * 3600) / 60;

        return hours + ":" + 
               minutes + ":" + 
               (seconds - hours * 3600 - minutes * 60);
    }
}
