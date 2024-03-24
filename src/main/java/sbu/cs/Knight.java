package sbu.cs;

public class Knight extends Player
{

    int type = 2;
    String nickName = " the Knight ";

    public Knight(int level,String name){
        playerName = name;
        setBaseAttrebute(type);
        this.health *= level;
        this.attackPower *= level;
        this.isAlive = true;
    }
}
