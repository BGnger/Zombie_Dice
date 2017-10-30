import java.util.Random;

public class Cup {
    public static void cup (){
        int Probability = 3;
        int[] ColorProbability = new int[Probability];
        Die Dice1 = new Die();
        Die Dice2 = new Die();
        Die Dice3 = new Die();
        for (int i = 0; i < 3; i++) {
            Random color = new Random();
            int Color = color.nextInt(100) + 1;
            ColorProbability[i] = Color;
        }
            if (ColorProbability[0] <= 46) {
                Dice1.setColor("Green");
            } else if (ColorProbability[0] <= 77) {
                Dice1.setColor("Yellow");
            } else if (ColorProbability[0] <= 100) {
                Dice1.setColor("Red");
            }
            if (ColorProbability[1] <= 46) {
                Dice2.setColor("Green");
            } else if (ColorProbability[1] <= 77) {
                Dice2.setColor("Yellow");
            } else if (ColorProbability[1] <= 100) {
                Dice2.setColor("Red");
            }
            if (ColorProbability[2] <= 46) {
                Dice3.setColor("Green");
            } else if (ColorProbability[2] <= 77) {
                Dice3.setColor("Yellow");
            } else if (ColorProbability[2] <= 100) {
                Dice3.setColor("Red");
            }
        System.out.println("Your first dice color is " + Dice1.getColor());
        System.out.println("Your second dice color is " + Dice2.getColor());
        System.out.println("Your third dice color is " + Dice3.getColor());
    }
}