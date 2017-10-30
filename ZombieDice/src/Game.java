import java.util.Scanner;

public class Game {
    public void displayGame() {
        boolean playAgain = true;
        while (playAgain) {
            System.out.println("Welcome to Zombie Dice!");

            Scanner scanner = new Scanner(System.in);
            Player player1 = new Player();
            Player player2 = new Player();
//        Die die1 = new Die();
//        Die die2 = new Die();
//        Die die3 = new Die();

            System.out.println("Player 1, please enter your name!");
            player1.setName(scanner.nextLine());
            if (player1.getName().equals("")) {
                player1.setName("Player1");
            }

            System.out.println("Player 2, please enter your name!");
            player2.setName(scanner.nextLine());
            if (player2.getName().equals("")) {
                player2.setName("Player2");
            }

            boolean gameRunning = true;
            boolean player1Turn = true;

//        int shots = 0;

            while (gameRunning) {
                while (player1Turn) {
                    System.out.println(player1.getName);
                    System.out.println(player1.getBrains);
                    System.out.println(player1.getSurvivors);
                    System.out.println(player1.getShots);
                    Die die1 = new Die();
                    Die die2 = new Die();
                    Die die3 = new Die();
                    String continueTurn = scanner.nextLine();
                    if (continueTurn.equalsIgnoreCase("quit")) {
                        player1Turn = false;
                        player1.setBrains(getSurvivors());
                        player1.setSurvivors(0);
                    }
                    if (player1.getBrains() >= 13) {
                        gameRunning = false;
                        player1Turn = false;
                    }
//                if (shots>=3) {
//                    player1Turn = false;
//                    shots = 0;
//                }
                }
                while (!player1Turn && gameRunning) {
                    System.out.println(player2.getName);
                    System.out.println(player2.getBrains);
                    System.out.println(player2.getSurvivors);
                    System.out.println(player2.getShots);
                    String continueTurn = scanner.nextLine();
                    if (continueTurn.equalsIgnoreCase("quit")) {
                        player1Turn = true;
                        player2.setBrains(getSurvivors());
                        player2.setSurvivors(0);
                    }
                    if (player2.getBrains() >= 13) {
                        gameRunning = false;
                    }
//                if (shots>=3) {
//                    player1Turn = true;
//                    shots = 0;
//                }
                }
            }
            System.out.println("Do you want to play again? [Y/N]");
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                playAgain = false;
            }
        }
    }
}
