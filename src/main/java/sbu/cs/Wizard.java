package sbu.cs;

public class Wizard extends Player
{

    int type = 3;

    String nickName = " the Wizard ";

    public Wizard(int level,String name){
        playerName = name;
        setBaseAttrebute(type);
        this.health *= level;
        this.attackPower *= level;
        this.isAlive = true;
    }
}
