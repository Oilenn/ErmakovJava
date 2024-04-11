package numericExer.n3_2.n1;

public abstract class Weapon {
    protected int ammo;

    public Weapon(int ammo){
        if(ammo<0) throw new IllegalArgumentException();
        this.ammo = ammo;
    }

    abstract void shoot();

    public int ammo(){
        return ammo;
    }

    public boolean getAmmo(){
        if(ammo==0) return false;
        ammo--;
        return true;
    }

    public void load(int ammo){
        if(ammo < 0) throw new IllegalArgumentException();
        this.ammo += ammo;
    }
}
