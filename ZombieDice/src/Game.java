import java.util.Scanner;

public class Game {
    public void displayGame(int numPlayers) {

//This while loop is responsible for restarting the game should the players want to play again at the end
        boolean playAgain = true;
        while (playAgain) {
            System.out.println("Welcome to Zombie Dice!");

            Scanner scanner = new Scanner(System.in);

//This section creates the player array and asks each player to enter their names
            Player[] players = new Player[numPlayers];
            for (int i=0;i<players.length;i++) {
                Player player = new Player();
                System.out.println("Player "+(i+1)+" please enter your name");
                player.setName(scanner.nextLine());
                players[i] = player;
            }

            Die[] dice = new Die[3];

            boolean rounds = true;
            boolean turn;

//This while loop consists of each round of the game
            while (rounds) {

//This for loop determines the current players turn
                for (int x = 0; x < players.length; x++) {

//This for loop reinitializes the dice
                    for (int i = 0; i < 3; i++) {
                        Die die = new Die();
                        dice[i] = die;
                    }

                    System.out.println("It is "+players[x].getName()+"'s turn!");
                    System.out.println("So far, you have currently have "+players[x]+" brains");
                    turn = true;

//This while loops handles what happens during each players turn
                    while (turn) {

//This for loop rolls the dice for the player
                        for (int i = 0; i < 3; i++) {
//This if/else statement determines whether the previous roll resulted in a runner and whether the die color needs to be rerolled
                            if (!dice[i].getSymbol().equalsIgnoreCase("Runner")) {
                                Cup.produceDie(dice[i]);
                                dice[i].rollColoredDie(players[x]);
                            } else {
                                dice[i].rollColoredDie(players[x]);
                            }
                            System.out.println("Dice number "+(i + 1)+" is a "+dice[i].getColor()+" "+dice[i].getSymbol());
                        }

                        System.out.println("So far this turn, you have "+players[x].getSurvivors()+" survivors cornered and "+players[x].getShots()+" shots taken");
                        System.out.println("");
                        System.out.println(players[x].getName()+" has "+players[x].getShots()+" shots");
                        System.out.println("");

//This if/else statement determines if the player has been shot 3+ times and ends their turn if they have been
                        if (players[x].getShots()>=3) {
                            System.out.println("You have been shot 3 or more time! All the survivor's you cornered this turn have gotten away!");
                            turn = false;
                        } else {
                            System.out.println("Would you like to roll again? [Y/N]");
                            if (scanner.nextLine().equalsIgnoreCase("N")) {
                                players[x].setBrains(players[x].getBrains()+players[x].getSurvivors());
                                players[x].setShots(0);
                                players[x].setSurvivors(0);
                                System.out.println("You now have a total of " + players[x].getBrains() + " brains");
                                turn = false;
                            }

//This if statement determines if the player has 13+ brains and thus wins the game
                            if (players[x].getBrains() >= 13) {
                                System.out.println("Congratulations " + players[x].getName() + "! You win!");
                                rounds = false;
                                x = players.length;
                            }

                        }
                    }
                }
            }

//This asks the players whether they want to play again
            System.out.println("Do you want to play again? [Y/N]");
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                playAgain = false;
            }
        }
    }
}
