import java.util.Random;

public class Cup {
    public void produceDie(Die die) {
        Random rand = new Random();
        int colorInt = rand.nextInt(100) + 1;
        if (colorInt<=46) {
            die.setColor("green");
        } else if (colorInt<=77) {
            die.setColor("yellow");
        } else if (colorInt<=100) {
            die.setColor("red");
        }
    }
}
