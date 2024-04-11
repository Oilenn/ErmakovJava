package numericExer.n1_6;

public class Ermakov_Ex1_6 {
    public static void main(String[] args){
        n1_10();
    }

    public static void n1_1() {
        House home = new House(-5);
    }

    public static void n1_2(){
        Time time = new Time(2,5,244);
        System.out.println(time);
    }

    public static void n1_3(){
        Square square = new Square(3, 5, 10);
        square.setLength(5);
        System.out.println(square.getLength());
    }

    public static void n1_4(){
        Fraction f1 = new Fraction(3,5);
        Fraction f2 = new Fraction(55,3);
        System.out.println(f1.minus(f2));
    }

    public static void n1_5(){
        Gun gun = new Gun(0, 7);

        gun.reload(3);

        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();

        gun.reload(8);

        gun.shoot();
        gun.shoot();

        gun.unLoad();

        gun.shoot();

    }

    public static void n1_6(){

    }

    public static void n1_7(){

    }

    public static void n1_10(){
        City city1 = new City("Москва");
        City city2 = new City("Питер");
        city1.addCityNode(city2,5);
        city1.addCityNode(city2,4);
        city1.addCityNode(city2,2);

        //city1.removeCityNode(city2);

        System.out.println(city1.getStringNodes());
    }
}
