package sbu.cs;

import static sbu.cs.App.jin;
import static sbu.cs.App.jout;

public abstract class Monster implements GameObject
{

    String monsterName;
    String nickName;
    int type;
    int health = 100;
    int attackPower = 10;
    int agility = 2;

    int takenDamage = 0;
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
        jout(monsterName+" attacked ");
        return attackPower;
    }

    @Override
    public void takeDamage(int damage) {
        takenDamage += damage;
        if (takenDamage >=health){
            damage -= takenDamage - health;
            takenDamage = health;
            isAlive = false;

        }
        jout(monsterName+ "!",1);
        jout(monsterName+" took ");
        jout(damage);
        jout(" damage !",1);
        jout(monsterName+ " health is now :");
        jout(health-takenDamage,1);
    }
    @Override
    public boolean isDead(){
        if(!isAlive) {
            jout(monsterName + " died", 1);
            jin();
        }
        return !isAlive;

    }
}
