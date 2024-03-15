package sbu.cs;

public class Goblin extends Monster{

    int type = 1;



    public Goblin(int level,String name){
        monsterName = name + " the Goblin " ;
        setBaseAttrebute(type);
        this.health *= level;
        this.attackPower *= level;
        this.isAlive = true;
    }

}
