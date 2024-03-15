package sbu.cs;

public class Assassin extends Player{

    int type = 1;

    public Assassin(int level,String name){
        playerName = name + " the Assassin " ;
        setBaseAttrebute(type);
        this.health *= level;
        this.attackPower *= level;
        this.isAlive = true;
    }
}
