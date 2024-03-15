package sbu.cs;

public class Knight extends Player
{

    int type = 2;


    public Knight(int level){
        setBaseAttrebute(type);
        this.health *= level;
        this.attackPower *= level;
    }

    @Override
    public int attack() {

        return 0;
    }

    @Override
    public void takeDamage(int damage) {

    }

}
