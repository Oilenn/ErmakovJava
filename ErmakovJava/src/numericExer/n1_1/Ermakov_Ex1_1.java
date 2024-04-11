package numericExer.n1_1;

public class Ermakov_Ex1_1 {
    public static void main(String[] args) {
        Ex1_4();
    }
    
    public static void Ex1_2(){
        Human human1 = new Human("Клеопатра", 152);
        Human human2 = new Human("Пушкин", 167);
        Human human3 = new Human("Владимир", 189);
        System.out.println(human1.getString());
        System.out.println(human2.getString());
        System.out.println(human3.getString());
    }
    
    public static void Ex1_3(){
        Name name1 = new Name("Kleopatra");
        System.out.println(name1);
        
        Name name2 = new Name("Alexandr", "Pushkin", "Sergeevich");
        System.out.println(name2);
        
        Name name3 = new Name("Vladimir", "Mayakovskiy");
        System.out.println(name3);
    }
    
    public static void Ex1_4(){
        Time time = new Time(362532);
        System.out.println(time.getString());
    }
    
    public static void Ex1_5(){
        House house = new House(5);
        System.out.println(house);
    }
}
