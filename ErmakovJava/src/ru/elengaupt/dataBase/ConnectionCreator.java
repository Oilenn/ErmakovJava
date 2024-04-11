package ru.elengaupt.dataBase;

public class ConnectionCreator {
    public ConnectionCreator(){

    }

    public static Connection createConnection(DataBase dataBase){
        return new Connection(dataBase.new Connection());
    }
}
