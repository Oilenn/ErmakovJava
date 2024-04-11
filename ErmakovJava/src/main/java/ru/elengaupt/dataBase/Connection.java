package ru.elengaupt.dataBase;

public class Connection {
    private final DataBase.Connection connection;

    public Connection(DataBase.Connection connection){
        this.connection = connection;
    }

    public String getString(int i){
        return connection.getString(i);
    }

    public void addString(String string){
        connection.addString(string);
    }
}
