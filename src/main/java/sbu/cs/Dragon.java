package sbu.cs;

public class Dragon extends Monster{
    int type = 2;

    public Dragon(int level){

        setBaseAttrebute(type);
        this.health *= level;
        this.attackPower *= level;
        this.isAlive = true;
    }

}
