package numericExer.n1_6;

public class Gun {
    private final int maxAmmo;
    private int ammo;

    public Gun(int ammo, int maxAmmo){
        setAmmo(ammo);
        if(maxAmmo < 0) {
            throw new IllegalArgumentException("Максимальное количество патрон не может быть отрицательным!");
        }

        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
    }

    public Gun(){
        this(5, 6);
    }

    public int getAmmo(){
        return ammo;
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
