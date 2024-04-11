package numericExer.n1_2;

import numericExer.n1_1.Point;

public class Ermakov_Ex1_2 {
    public static void main(String[] args) {
        n2_4();
    }

    public static void n2_1(){
        //1.	Линия 1 с началом в т. {1;3} и концом в т.{23;8}.
        Line line1 = new Line(new Point(1,3), new Point(23,8));

        //2.	Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25.
        Line line2 = new Line(new Point(5,10), new Point(25,10));

        //3.	Линия 3 которая начинается всегда там же где начинается линия 1, и заканчивается всегда там же, где заканчивается линия
        //Таким образом, если положение первой или второй линии меняется, то меняется и третья линия.
        Line line3 = new Line(line1.start, line2.end);//3

        //4.	После создания всех трех объектов измените координаты первой и второй линий, причем сделайте
        //это таким образом, чтобы положение третьей линии соответствовало требованиям пункта 3.
        line1.start = new Point(3, 1);
        line2.end = new Point(1, 3);

        //5.	Измените координаты первой линии так, чтобы при этом не изменились, координаты третьей линии.
        line1.end = new Point(5, 5);
    }

    public static void n2_2(){
        Human human1 = new Human(new Name("Клеопатра"), 152);
        System.out.println(human1);

        Human human2 = new Human(new Name("Александр", "Пушкин", "Сергеевич"), 167);
        System.out.println(human2);

        Human human3 = new Human(new Name("Владимир", "Маяковский"), 189);
        System.out.println(human3);
    }

    public static void n2_3(){
        Human father = new Human(new Name("Эдуард", "Шизович"), 166);
        Human son = new Human(new Name("Федя"), 155, father);
        System.out.println(son);
        System.out.println(father);
    }

    public static void n2_4(){
        Departament IT = new Departament("IT отдел");

        Staff staff1 = new Staff("Петрова", IT);
        Staff staff2 = new Staff("Козлова", IT);
        Staff staff3 = new Staff("Сидорова", IT);

        IT.boss = staff2;

        System.out.println(staff1);
        System.out.println(staff2);
        System.out.println(staff3);
    }
}


