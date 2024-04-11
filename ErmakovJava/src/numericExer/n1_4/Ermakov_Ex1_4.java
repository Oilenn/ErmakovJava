package numericExer.n1_4;

public class Ermakov_Ex1_4 {
    public static void main(String[] args){
        n1_4();
    }

    public static void n1_3(){
        House house1 = new House(2);
        House house2 = new House(35);
        House house3 = new House(91);

        //house1.floors = 215;
        //house1.changeFloors(555);
    }

    public static void n1_4(){
        Time time1 = new Time(10000);
        System.out.println(time1.toString());

        Time time2 = new Time(5,3,2);
        System.out.println(time2.toString());
    }
}
