package sbu.cs;

public class Wizard extends Player
{

    int type = 3;

    public Wizard(int level){
        setBaseAttrebute(type);
        this.health *= level;
        this.attackPower *= level;
    }
}
