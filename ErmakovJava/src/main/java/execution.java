import ru.elengaupt.geometry.Line;
import ru.elengaupt.utils.Utils;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class execution {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        List<String> list = Utils.fieldCollection(new City("Берлин"));
//
////        for (String s:
////                list) {
////            System.out.println(s);
////        }
//        System.out.println(list.size());
//        for (String s: list){
//            System.out.println("Хамах: " + s + " (c)");
//        }

        Line line1 = new Line(1,1,2,2);
        Line line2 = new Line(3,3,4,4);

        Utils.lineConnector(line1,line2);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line1);
        System.out.println(line2);
        //Storage<String> storage = new Storage<String>("2");
        //System.out.println(storage.getObject("55"));

        //Fraction fr1 = new Fraction(3,5);
        //Fraction fr2 = new Fraction(5,1);
        //Point point1 = new Point(3,5);
        //java.awt.Point point2 = new java.awt.Point(5,5);


        //System.out.println(point1);
        //System.out.println(point2);
        //System.out.println(Fraction.sum(3,new Fraction(11,3),3.21,new BigInteger(12345678912345678912)));//???
    }

    public static double powString(String x, String y){
        return pow(parseInt(x), parseInt(y));
    }
}
