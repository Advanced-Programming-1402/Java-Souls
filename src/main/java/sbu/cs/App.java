package sbu.cs;

import java.util.ArrayList;
import java.util.List;
import java.util.PropertyPermission;
import java.util.Scanner;

public class App {


    private static List<Monster> monsterList = new ArrayList<>();
    private static List<Player> playerList = new ArrayList<>();

    public static void main(String[] args) {
        runMenu();
        runGame(playerList.getFirst());
    }
    public static void runGame(Player user){
        while (true){
            for (int i = 0; i < 10; i++) {
                startBattle(user, monsterList.get(i));
                if (user.isAlive) {
                    user.recovery();
                    user.coin += 10 * (i+1);
                } else {
                    jout("Game Over", 1);
                    jout("level up to win", 1);
                    user.recovery();
                    user.isAlive = true;
                    for (int j = 0; j < 10; j++) {
                        monsterList.get(j).isAlive= true;
                        monsterList.get(j).takenDamage= 0;
                    }
                    break;
                }

            }
            jout("do you want to level Up?",1);
            jout("you have ");
            jout(user.coin);
            jout(" coins");

            switch (jin()){
                case "y":
                    if (user.coin>=25){
                        user.levelUp();

                    }
                    else
                    {
                        jout("you don't have enough coins",1);
                    }
                    break;
                case "exit":
                    return;
                case null, default:
                    break;

            }
        }
    }

    static Scanner myObj = new Scanner(System.in);
    public static void runMenu() {

        int playerType = showMenu();

        if(playerType > 0){
            jout("enter your name",1);
            createCharacter(playerType,1,"player",jin());
            startingChampain();
        }
        else {
            return;
        }

    }

    public static void createCharacter(int type,int level,String side,String name) {

        if (side.equals("player")){
            switch (type){
                case 1:
                    playerList.add(new Assassin(level,name));
                    break;
                case 2:
                    playerList.add(new Knight(level,name));
                    break;
                case 3:
                    playerList.add(new Wizard(level,name));
                    break;
            }
        }
        if (side.equals("monster")){
            switch (type){
                case 1:
                    monsterList.add(new Goblin(level,name));
                    break;
                case 2:
                    monsterList.add(new Dragon(level,name));
                    break;
                case 3:
                    monsterList.add(new Skeleton(level,name));
                    break;
            }
        }

    }

    public static void startBattle(GameObject ally, GameObject enemy) {

        int turnCount = 0;
        while(!battleEnd(ally,enemy)){
            turnCount ++;
            enemy.takeDamage(ally.attack());
            ally.takeDamage(enemy.attack());
        }


    }
    public static boolean battleEnd(GameObject ally, GameObject enemy){
        return ally.isDead() || enemy.isDead();
    }
    public static int showMenu(){
        jout("Menu",1);
        jout("1.New Game",1);
        jout("2.Exit",1);



        switch (jin()) {
            case "1":
                jout("select Your Character",1);
                jout("1.Assassin",1);
                jout("2.Knight",1);
                jout("2.Wizard",1);

                return jin(1);
            case "2":
                return 0;
        }
        return 0;
    }

    public static void startingChampain(){
        createCharacter(1,1,"monster","Jack");
        createCharacter(1,2,"monster","Grizzletooth");
        createCharacter(3,1,"monster","Bob");
        createCharacter(1,3,"monster","Snagglefang");
        createCharacter(3,2,"monster","Cryptwhisper");
        createCharacter(1,4,"monster","Mossnose");
        createCharacter(1,5,"monster","Gloomspike");
        createCharacter(1,6,"monster","Ratgob");
        createCharacter(3,3,"monster","Soulrattle");
        createCharacter(2,1,"monster","Obsidianax");

    }

    public static void jout(String output){
        System.out.print(output);
    }
    public static void jout(String output, int endl){
        System.out.println(output);
    }
    public static void jout(int output, int endl){
        System.out.println(output);
    }
    public static void jout(int output){
        System.out.print(output);
    }
    public static String jin(){
        return myObj.nextLine();
    }
    public static int jin(int is_int){
        return Integer.parseInt(myObj.nextLine());
    }


}