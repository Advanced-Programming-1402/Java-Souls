package sbu.cs;

import static sbu.cs.App.jout;

public abstract class Player implements GameObject
{
    String playerName;
    String nickName;
    int coin = 0;
    int type;
    int health = 101;
    int attackPower = 10;

    int agility = 1;

    int takenDamage = 0;

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
        jout(playerName+" attacked ");
        return attackPower;
    }
    @Override
    public void takeDamage(int damage) {
        takenDamage += damage;
        if (takenDamage>=health){
            damage -= takenDamage - health;
            takenDamage = health;
            isAlive = false;
            jout(playerName+" died",1);
        }
        jout(playerName+ "!",1);
        jout(playerName+" took ");
        jout(damage);
        jout(" damage !",1);
        jout(playerName+ " health is now :");
        jout(health-takenDamage,1);
    }
    @Override
    public boolean isDead(){
        if(!isAlive) {
            jout(playerName + " died", 1);
        }
        return !isAlive;

    }
    public void recovery(){
        takenDamage = 0;

    }
    public void levelUp(){
        health *= 2;
        attackPower *= 2;
        jout("your health is : ");

        jout(health,1);

        jout("your attack power is : ");

        jout(attackPower,1);
        coin -= 25;

    }
    //    public void ability(){
//
//    }
}
