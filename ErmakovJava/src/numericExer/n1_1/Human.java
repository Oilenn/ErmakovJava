package numericExer.n1_1;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oilen
 */
public class Human {
    String name;
    int height;
    
    public Human(String name, int height){
        this.name = name;
        this.height = height;
    }
    
    public String getString(){
        return name + ", рост: " + height; 
    }
}
