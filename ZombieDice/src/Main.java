import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Game play = new Game();
        play.playZombieDice(play.determineNumPlayers());
    }
}
