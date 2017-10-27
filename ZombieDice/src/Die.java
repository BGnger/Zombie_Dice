 import java.util.Random;
 public class Die {

     public String[] colorChoice = {"green", "red", "yellow"};
     public String color = "";

     public Die() {
         Random rand = new Random();
         int randNumber = rand.nextInt(100) + 1;
         if (randNumber <= 46) {
             color = colorChoice[0];
         } else if (randNumber <= 77) {
             color = colorChoice[1];
         } else if (randNumber <= 100) {
             color = colorChoice[2];
         }
     }
 }

