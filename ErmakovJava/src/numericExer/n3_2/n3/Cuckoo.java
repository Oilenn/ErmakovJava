package numericExer.n3_2.n3;

public class Cuckoo extends Bird{
    public Cuckoo() {
        super("ку-ку");
    }

    @Override
    public void sing() {
        double iteration = Math.random() * 10;

        for(int i = 0; i < iteration; i++){
            System.out.println("ку-ку\n");
        }
    }
}
