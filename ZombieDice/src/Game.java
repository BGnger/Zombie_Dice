import java.util.Scanner;

public class Game {
    public void displayGame(int numPlayers) {
        boolean playAgain = true;
        boolean playing = true;
        boolean turn;

        System.out.println("Welcome to Zombie Dice!");
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[numPlayers];
        Die[] dice = new Die[3];

        for (int i=0;i<players.length;i++) {
            Player player = new Player();
            System.out.println("Player "+(i+1)+" please enter your name");
            player.setName(scanner.nextLine());
            players[i] = player;
        }

        while (playAgain) {
            while (playing) {
                for (int x = 0; x < players.length; x++) {
                    turn = true;

                    while (turn) {
                        for (int i = 0; i < 3; i++) {
                            Die die = new Die();
                            dice[i] = die;
                        }

                        System.out.println("It's " + players[x].getName() + "'s turn");
                        System.out.println("So far you have " + players[x].getBrains() + " brains");

                        for (int i = 0; i < 3; i++) {
                            if (!dice[i].getSymbol().equalsIgnoreCase("Runner")) {
                                Cup.produceDie(dice[i]);
                                dice[i].rollColoredDie(players[x]);
                            } else {
                                dice[i].rollColoredDie(players[x]);
                            }
                            System.out.println("Dice number " + (i + 1) + " is a " + dice[i].getColor() + " " + dice[i].getSymbol());
                        }

                        System.out.println();
                        System.out.println(players[x].getName() + " has " + players[x].getSurvivors() + " survivors\n");
                        System.out.println(players[x].getName() + " has " + players[x].getShots() + " shots\n");

                        if (players[x].getShots() >= 3) {
                            System.out.println("You have been shot 3 or more time! All the survivor's you cornered this turn have gotten away!");
                            players[x].setShots(0);
                            players[x].setSurvivors(0);
                            turn = false;
                        } else {
                            System.out.println("Would you like to roll again? [Y/N]");

                            if (scanner.nextLine().equalsIgnoreCase("N")) {
                                players[x].setBrains(players[x].getBrains() + players[x].getSurvivors());
                                players[x].setShots(0);
                                players[x].setSurvivors(0);
                                System.out.println("You now have a total of " + players[x].getBrains() + " brains");
                                turn = false;
                            }

                            if (players[x].getBrains() >= 13) {
                                System.out.println("Congratulations " + players[x].getName() + "! You win!");
                                x = players.length;
                                turn = false;
                            }
                        }

                        System.out.println("----------------------------------------------\n");
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

