package numericExer.n1_4;

public class Name {
    private String personalName;
    private String surname;
    private String patronymic;

    public Name(String personalName, String surname, String patronymic){
        this.personalName = personalName;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public Name(String personalName){
        this(personalName, null, null);
    }
    
    public Name(String personalName, String surname){
        this(personalName, surname, null);
    }

    public void changePatronymicByFather(Name father){
        String fatherName = father.getPersonalName();
        //char fatherLastSymb = fatherName.charAt(fatherName.length() - 1);
        patronymic = fatherName + "ович";
    }

    public void changeSurnameByFather(Name father){
        surname = father.getSurname();
    }

    public void changeNameByFather(Name father) {
        if(patronymic == null) {
            changePatronymicByFather(father);
        }
        if (surname == null) {
            changeSurnameByFather(father);
        }
    }

    public String getPatronymic(){
        return patronymic;
    }
    public String getPersonalName(){
        return personalName;
    }
    public String getSurname(){
        return surname;
    }


    public String toString(){
        return (surname == null ? "" : surname  + " ")
                + personalName +
               (patronymic == null ? "" : " " + patronymic);
    }
}
