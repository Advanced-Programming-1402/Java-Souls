package sbu.cs;

import static sbu.cs.App.battleEnd;
import static sbu.cs.App.jout;

public abstract class Monster implements GameObject
{

    String monsterName;
    int type;
    int health = 100;
    int attackPower = 10;
    int agility = 2;

    int takenDamge = 0;
    boolean isAlive = true;
    public Monster() {

    }

    @Override
    public void setBaseAttrebute(int type) {
        switch (type){
            case 1:
                health *= 2;
                break;
            case 2:
                health *= 5;
                attackPower *= 5;
                agility /= 2;
                break;
            case 3:
                attackPower *= 2;
                agility *= 1.5;
                break;
        }
    }

    @Override
    public int attack() {
        jout(monsterName+"attacked with ");
        int result = attackPower;
        return result;
    }

    @Override
    public void takeDamage(int damage) {
        takenDamge += damage;
        if (takenDamge>=health){
            damage -= takenDamge - health;
            takenDamge = health;
            isAlive = false;

        }
        jout(damage);
        jout(" damage to "+ monsterName);
        jout(monsterName+ " health is now :");
        jout(health-takenDamge,1);
    }
    @Override
    public boolean isDead(){
        if(!isAlive) {
            jout(monsterName + " died", 1);
        }
        return !isAlive;

    }
}
