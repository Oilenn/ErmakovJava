package ru.elengaupt.time;

public class Time {
    int seconds, minutes, hours;
    //555 33 25
    public Time(int seconds, int minutes, int hours){
        if(hours == 0 && minutes == 0){
            hours = seconds / 3600;
            minutes = (seconds - hours * 3600) / 60;
            seconds = (seconds - hours * 3600 - minutes * 60);
        }
        this.hours = seconds / 3600 + minutes / 60 + hours;
        while(this.hours > 24){
            this.hours -= 24;
        }

        this.minutes = minutes < 60 ? minutes : minutes / 60;
        this.seconds = seconds < 60 ? seconds : seconds / 60;
    }

    public Time(int seconds, int minutes){
        this(seconds, minutes, 0);
    }

    public Time(int seconds){
        this(seconds, 0, 0);
    }

    public int getHour(){
        return hours;
    }

    public int getSeconds(){
        return seconds;
    }
    public int getMinutes(){
        return minutes;
    }

    public String toString(){
        return hours + ":" +
                minutes + ":" +
                seconds;
    }
}
