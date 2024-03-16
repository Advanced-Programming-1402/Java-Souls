package sbu.cs;

public class Dragon extends Monster{
    int type = 2;

    String nickname = "the Dragon";


    public Dragon(int level,String name){
        monsterName = name ;
        setBaseAttrebute(type);
        this.health *= level;
        this.attackPower *= level;
        this.isAlive = true;
    }

}
