package sbu.cs;

public class Assassin extends Player{

    int type = 1;
    String nickName = " the Assassin ";
    public Assassin(int level,String name){
        playerName = name;
        setBaseAttrebute(type);
        this.health *= level;
        this.attackPower *= level;
        this.isAlive = true;
    }
}
