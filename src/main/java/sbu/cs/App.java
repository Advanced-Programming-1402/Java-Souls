package sbu.cs;

import java.util.ArrayList;
import java.util.List;
import java.util.PropertyPermission;
import java.util.Scanner;

public class App {

//    private static List<Monster> monsterList;
//    private static List<Player> playerList;
    private static List<Monster> monsterList = new ArrayList<>();
    private static List<Player> playerList = new ArrayList<>();

    public static void main(String[] args) {
        runMenu();
    }

    static Scanner myObj = new Scanner(System.in);
    public static void runMenu() {

        int playerType = showMenu();
        if(playerType > 0){
            createCharacter(playerType,"player");
        }
        else return;
        createCharacter(1,"monster");
        startBattle(playerList.getFirst(),
                monsterList.getFirst());
    }

    public static void createCharacter(int type,String side) {

        if (side.equals("player")){
            switch (type){
                case 1:
                    playerList.add(new Assassin(1,"mmd"));
                    break;
                case 2:
                    playerList.add(new Knight(1));
                    break;
                case 3:
                    playerList.add(new Wizard(1));
                    break;
            }
        }
        if (side.equals("monster")){
            switch (type){
                case 1:
                    monsterList.add(new Goblin(1,"jack"));
                    break;
                case 2:
                    monsterList.add(new Dragon(1));
                    break;
                case 3:
                    monsterList.add(new Skeleton(1));
                    break;
            }
        }

    }
//    public static void startBattle(ArrayList<Player> ally,ArrayList<Monster> enemy) {
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