package ru.elengaupt.weapons;

public class MachineGun extends Gun {
    private int rateOfFire;

    public MachineGun(int ammo, int maxAmmo, int rateOfFire){
        super(ammo, maxAmmo);
        setRateOfFire(rateOfFire);
    }

    public MachineGun(int maxAmmo, int rateOfFire){
        this(maxAmmo, maxAmmo, rateOfFire);
    }

    public MachineGun(int ammo){
        this(ammo, ammo, ammo / 2);
    }

    public MachineGun(){
        this(30,30,30);
    }

    public void setRateOfFire(int rateOfFire){
        if(rateOfFire < 1){
            throw new IllegalArgumentException("Скорострельность не может быть меньше 1!");
        }
        this.rateOfFire = rateOfFire;
    }

    public int getRateOfFire(){
        return rateOfFire;
    }

    @Override
    public void shoot(){
       for(int i = 0; i < rateOfFire; i++){
           super.shoot();
       }
    }


    public void shoot(int seconds){
        for(int i = 0; i < seconds; i++) {
            shoot();
        }
    }
}
