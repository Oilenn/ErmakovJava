package ru.elengaupt.weapons;

public class Shooter {
    public String name;
    public Weapon weapon;

    public Shooter(String name, Weapon weapon){
        this.name = name;
        this.weapon = weapon;
    }

    public Shooter(String name){
        this(name, null);
    }

    public void shoot(){
        if(weapon == null){
            System.out.println(name + ":");
            System.out.println("Не могу участвовать в перестрелке");
            return;
        }
        System.out.println(name + " стреляет: ");
        weapon.shoot();
    }
}
