 import java.util.Random;
 public class Die {

     private String[] colorChoice = {"green", "red", "yellow"};
     private String color = "";
     private String symbol = "";

     public Die() {

     }

  public void rollColoredDie(Player player){
       int[] green = {3, 5, 6};
       int[] yellow = {2, 4, 6};
       int[] red = {1, 3, 6};
       if(this.color.equalsIgnoreCase("green")){
           dieRoll(green, player);
       }else if(this.color.equalsIgnoreCase("yellow")){
           dieRoll(yellow, player);
       }else if(this.color.equalsIgnoreCase("red")){
            dieRoll(red, player);
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

  // depending on the int[] called out by the rollColoredDie method, the Color Die will be rolled with different values
  // based on what the variable color will be.
  private void dieRoll(int[] stats, Player player){
      Random rand = new Random();
      int randNum = rand.nextInt(6) + 1;
      if(randNum <= stats[0]){
          player.setSurvivors(player.getSurvivors() + 1);
          this.symbol = "Brain";
      }else if(randNum <= stats[1]){
        this.symbol = "Runner";
      }else if(randNum <= stats[2]){
          player.setShots(player.getShots() + 1);
          this.symbol = "Shot";
      }
  }

  public String getSymbol(){return symbol;}
 }

