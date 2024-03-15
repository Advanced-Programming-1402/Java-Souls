package sbu.cs;

import static sbu.cs.App.jout;

public abstract class Player implements GameObject
{
    String playerName;
    int type;
    int health = 101;
    int attackPower = 10;

    int agility = 1;

    int takenDamge = 0;

    boolean isAlive = true;
    public Player() {

    }

    @Override
    public void setBaseAttrebute(int type) {
        switch (type){
            case 1:
                attackPower *= 3;
                break;
            case 2:
                health *= 4;
                break;

            case 3:
                attackPower *= 2;
                health *= 2;
                break;
        }
    }
    @Override
    public int attack() {
        jout(playerName+"attacked with ");
        return attackPower;
    }
    @Override
    public void takeDamage(int damage) {
        takenDamge += damage;
        if (takenDamge>=health){
            damage -= takenDamge - health;
            takenDamge = health;
            isAlive = false;
            jout(playerName+" died",1);
        }
        jout(damage);
        jout(" damage to "+ playerName);
        jout(playerName+ " health is now :");
        jout(health-takenDamge,1);
    }
    @Override

    public boolean isDead(){
        if(!isAlive) {
            jout(playerName + " died", 1);
        }
        return !isAlive;
    }
    //    public void ability(){
//
//    }
}
