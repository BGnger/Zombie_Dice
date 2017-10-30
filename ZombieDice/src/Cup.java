import java.util.Random;

public class Cup {
    int Probability = 3;
    int[] ColorProbability = new int[Probability];
    String Dice1 = " ";
    String Dice2 = " ";
    String Dice3 = " ";

    for (int i = 0; i <3; i++) {
    Random color = new Random();
    int Color = color.nextInt(100);
    ColorProbability[i] = Color;
    //Probability++;

    if (ColorProbability[0] <= 46) {
        Dice1 = "Green ";
    } else if (ColorProbability[0] <= 77) {
        Dice1 = "Yellow ";
    } else if (ColorProbability[0] <= 100) {
        Dice1 = "Red ";
    }
    if (ColorProbability[1] <= 46) {
        Dice2 = "Green ";
    } else if (ColorProbability[1] <= 77) {
        Dice2 = "Yellow ";
    } else if (ColorProbability[1] <= 100) {
        Dice2 = "Red ";
    }
    if (ColorProbability[2] <= 46) {
        Dice3 = "Green ";
    } else if (ColorProbability[2] <= 77) {
        Dice3 = "Yellow ";
    } else if (ColorProbability[2] <= 100) {
        Dice3 = "Red ";
    }

    }
        System.out.println("Your first dice color is " + Dice1);
        System.out.println("Your second dice color is " + Dice2);
        System.out.println("Your third dice color is " + Dice3);
}