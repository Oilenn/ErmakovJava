package ru.elengaupt;

import ru.elengaupt.human.Name;

public class NameGenerator {
    private static NameGenerator nameGenerator;
    private Name name;

    private NameGenerator() {
        this.name = new Name("");
    }

    public static NameGenerator getInstance(){
        if(nameGenerator == null) {
            return new NameGenerator();
        }
        return nameGenerator;
    }

    public NameGenerator setName(String presonalName){
        name.setPersonalName(presonalName);
        return this;
    }

    public NameGenerator setSurname(String surname){
        name.setSurname(surname);
        return this;
    }

    public NameGenerator setPatronymic(String patronymic){
        name.setPatronymic(patronymic);
        return this;
    }

    public Name build(){
        return name;
    }
}
