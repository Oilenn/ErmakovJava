package ru.elengaupt.dataBase;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    protected List<String> strings;
    private int connectionsCount;

    public DataBase(int connectionsCount){
        this.strings = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            strings.add(String.format("%d",i));
        }

        this.connectionsCount = connectionsCount;
    }

    public class Connection{
        public String getString(int i){
            return strings.get(i);
        }

        public void addString(String string){
            strings.add(string);
        }
    }
}