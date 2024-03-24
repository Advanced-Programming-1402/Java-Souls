package sbu.cs;

public class Skeleton extends Monster{

    int type = 3;
    String nickname = "the Skeleton";


    public Skeleton(int level,String name){
        monsterName = name ;
        setBaseAttrebute(type);
        this.health *= level;
        this.attackPower *= level;
        this.isAlive = true;
    }


}
