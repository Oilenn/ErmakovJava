package numericExer.n3_2.n1;

public class Gun extends Weapon{
    private int maxAmmo;

    public Gun(int ammo, int maxAmmo){
        super(ammo);
        if(maxAmmo > 0) {
            this.maxAmmo = maxAmmo;
        }
    }

    public Gun(){
        this(5, 6);
    }

    private void setAmmo(int ammo){
        if(ammo < 0) {
            throw new IllegalArgumentException("Количество патрон не может быть отрицательным!");
        }
        this.ammo = ammo;
    }

    public boolean isLoaded(){
        return ammo > 0;
    }

    public void reload(int ammo){
        if(ammo > maxAmmo){
            setAmmo(maxAmmo);
            return;
        }
        else if(ammo < 0){
            throw new IllegalArgumentException("Количество патрон не может быть меньше 0!");
        }
        setAmmo(maxAmmo);
    }

    public int unLoad(){
        ammo = 0;
        return ammo;
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
