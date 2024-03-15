package sbu.cs;

public class Skeleton extends Monster{

    int type = 3;


    public Skeleton(int level){
        setBaseAttrebute(type);
        this.health *= level;
        this.attackPower *= level;
        this.isAlive = true;
    }


}
