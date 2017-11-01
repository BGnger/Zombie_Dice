import java.util.Scanner;

public class Game {
    public void displayGame() {
        boolean playAgain = true;
        while (playAgain) {
            System.out.println("Welcome to Zombie Dice!");

            Scanner scanner = new Scanner(System.in);
            Player player1 = new Player();
            Player player2 = new Player();
            Player[] players = new Player[2];
            for (int i=0;i<players.length;i++) {
                Player player = new Player();
                System.out.println("Player "+(i+1)+" please enter your name");
                player.setName(scanner.nextLine());
                players[i] = player;
            }
            Die[] dice = new Die[3];

            boolean gameRunning = true;
            boolean turn;


            while (gameRunning) {
                for (int x = 0; x < players.length; x++) {
                    for (int i = 0; i < 3; i++) {
                        Die die = new Die();
                        dice[i] = die;
                    }
                    System.out.println("It is "+players[x].getName()+"'s turn!");
                    turn = true;
                    while (turn) {
                        for (int i = 0; i < 3; i++) {
                            if (!dice[i].getSymbol().equalsIgnoreCase("Runner")) {
                                Cup.produceDie(dice[i]);
                                dice[i].rollColoredDie(players[x]);
                            } else {
                                dice[i].rollColoredDie(players[x]);
                            }
                            System.out.println("Dice number "+(i + 1)+" is a "+dice[i].getColor()+" "+dice[i].getSymbol());
                        }
                        System.out.println("So far this turn, you have "+players[x].getSurvivors()+" survivors cornered and "+players[x].getShots()+" shots taken");
                        System.out.println("Would you like to roll again? [Y/N]");
                        if (scanner.nextLine().equalsIgnoreCase("N")) {
                            players[x].setBrains(players[x].getSurvivors());
                            players[x].setShots(0);
                            players[x].setSurvivors(0);
                            System.out.println("You now have a total of "+players[x].getBrains()+" brains");
                            turn = false;
                        }
                        if (players[x].getBrains()>=13) {
                            System.out.println("Congratulations "+players[x].getName()+"! You win!");
                            gameRunning = false;
                            x=players.length;
                        }
                    }
                }
            }
            System.out.println("Do you want to play again? [Y/N]");
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                playAgain = false;
            }
        }
    }
}
