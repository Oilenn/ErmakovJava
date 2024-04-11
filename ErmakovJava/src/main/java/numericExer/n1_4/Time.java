package numericExer.n1_4;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oilen
 */
public class Time {
    int seconds, minutes, hours;
    
    public Time(int seconds, int minutes, int hours){
        setSeconds(seconds);
        setMinutes(minutes);
        setHours(hours);
    }

    public Time(int seconds, int minutes){
        this(seconds, minutes, 0);
    }

    public void setSeconds(int newSeconds){
        if(newSeconds <= 0) throw new IllegalArgumentException();
        this.seconds = newSeconds;
    }

    public void setMinutes(int newMinutes){
        if(newMinutes <= 0) throw new IllegalArgumentException();
        this.minutes = newMinutes;
    }

    public void setHours(int newHours){
        if(newHours <= 0) throw new IllegalArgumentException();
        this.hours = newHours;
    }

    public Time(int seconds){
        this(seconds, 0, 0);
    }

    public String toString(){
        int hours = (seconds / 3600) + this.hours;
        int minutes = ((seconds - hours * 3600) / 60) + this.minutes;
        int seconds = this.seconds - hours * 3600 - minutes * 60;
        return hours + ":" + 
               minutes + ":" +
               seconds;
    }
}
