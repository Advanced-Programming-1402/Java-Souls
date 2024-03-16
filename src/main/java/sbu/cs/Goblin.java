package sbu.cs;

public class Goblin extends Monster{

    int type = 1;
    String nickname = "the Goblin";


    public Goblin(int level,String name){
        monsterName = name ;
        setBaseAttrebute(type);
        this.health *= level;
        this.attackPower *= level;
        this.isAlive = true;
    }

}
