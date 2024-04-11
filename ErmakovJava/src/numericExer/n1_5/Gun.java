package numericExer.n1_5;

public class Gun {
    int ammo;

    public Gun(int ammo){
        this.ammo = ammo;
    }

    public Gun(){
        this.ammo = 5;
    }

    public void shoot(){
        if(ammo > 0) {
            System.out.println("Бах!");
            ammo--;
        }
        else{
            System.out.println("Клац!");
        }
    }
}
