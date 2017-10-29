 import java.util.Random;
 public class Die {

     private String[] colorChoice = {"green", "red", "yellow"};
     private String color = "";

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
  public int dieRoll(Player player){
       Random rand = new Random();
       int randNum = rand.nextInt(6) + 1;
       if(this.color.contentEquals("green")){
           if(randNum <= 3){
                //whatever the statistic the three is.
           }
       }
  }
 }

