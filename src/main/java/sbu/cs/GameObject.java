package sbu.cs;

// There is no need to modify this interface unless uou plan on adding new universal features.
public interface GameObject {

    int attack();

    void takeDamage(int damage);

    void setBaseAttrebute(int type);

    boolean isDead();

}