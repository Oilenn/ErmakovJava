package ru.elengaupt.utils;

import ru.elengaupt.geometry.Line;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<String> fieldCollection(Object object){
        List<Field> fields = List.of(object.getClass().getFields());
        List<String> result = new ArrayList<String>();
        for (Field f:fields) {
            result.add(f.getName());
        }
        return result;
    }
    public static void lineConnector(Line line1, Line line2) throws NoSuchFieldException, IllegalAccessException{

        Field end = Line.class.getDeclaredField("end");
        end.setAccessible(true);

        Field start = Line.class.getDeclaredField("start");
        start.setAccessible(true);

        end.set(line1, line2.getStart());
    }
}
