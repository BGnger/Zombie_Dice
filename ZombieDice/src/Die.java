 import java.util.Random;
 public class Die {

     private String[] colorChoice = {"green", "red", "yellow"};
     private String color = "";

     public Die() {

     }

  public void dieRoll(Player player){
       Random rand = new Random();
       int randNum = rand.nextInt(6) + 1;
       if(this.color.contentEquals("green")){
           if(randNum <= 3){
                player.setSurvivors(player.getSurvivors++);
           }else if(randNum <= 5){

           }else if(randNum == 6){
               player.setShots(player.getShots++);
           }
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
 }

