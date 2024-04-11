package numericExer.n1_1;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oilen
 */
public class Name {
    String personalName;
    String surname;
    public String patronymic;
    
    public Name(String personalName){
        this(personalName, null, null);
    }
    
    public Name(String personalName, String surname){
        this(personalName, surname, null);
    }
    
    public Name(String personalName, String surname, String patronymic){
        this.personalName = personalName;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public String toString(){
        return (surname == null ? "" : surname  + " ")
                + personalName +
               (patronymic == null ? "" : " " + patronymic);
    }
}
