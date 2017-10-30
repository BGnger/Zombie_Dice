import java.util.Random;

public class Cup {
    public static Die[] cup(int numDice){
        int[] ColorProbability = new int[numDice];
        Die[] dice = new Die[numDice];
        for (int i = 0; i < numDice; i++) {
            Random color = new Random();
            int Color = color.nextInt(100) + 1;
            ColorProbability[i] = Color;
            if (ColorProbability[i] <= 46) {
                dice[i].setColor("Green");
            } else if (ColorProbability[i] <= 77) {
                dice[i].setColor("Yellow");
            } else if (ColorProbability[i] <= 100) {
                dice[i].setColor("Red");
            }

        }
        return dice;
    }
}