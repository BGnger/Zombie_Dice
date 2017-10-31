 import java.util.Random;
 public class Die {

     private String[] colorChoice = {"green", "red", "yellow"};
     private String color = "";

     public Die() {

     }

  public void dieRoll(Player player){
       int[] green = {3, 5, 6};
       int[] yellow = {2, 4, 6};
       int[] red = {1, 3, 6};

       if(this.color.equalsIgnoreCase("green")){
           rollColoredDie(green, player);
       }else if(this.color.equalsIgnoreCase("yellow")){
           rollColoredDie(yellow, player);
       }else if(this.color.equalsIgnoreCase("red")){
            rollColoredDie(red, player);
       }
  }

  public void setColor(String color){
      if(color.equalsIgnoreCase("green") || color.equalsIgnoreCase("yellow") || color.equalsIgnoreCase("red")) {
          this.color = color;
      }else{
          this.color = "green";
      }
  }

  public String getColor(){return color;}

  private void rollColoredDie(int[] stats, Player player){
      Random rand = new Random();
      int randNum = rand.nextInt(6) + 1;
      if(randNum <= stats[0]){
          player.setSurvivors(player.getSurvivors() + 1);
      }else if(randNum <= stats[1]){

      }else if(randNum <= stats[2]){
          player.setShots(player.getShots() + 1);
      }
  }
 }

