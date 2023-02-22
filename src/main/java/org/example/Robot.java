package org.example;

public class Robot {
    public String name;
    public String weaponName;
    public int weaponPower;

    public Robot() {
        this.name = "Freddy the Robot";
        this.weaponName = "Sword";
        this.weaponPower = 50;


    }

    public void Attack(){
        System.out.println(this.name + " Attacks with their " + this.weaponName + " for " + this.weaponPower + " damage!");
    }
}
