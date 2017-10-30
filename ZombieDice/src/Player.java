public class Player {

    private String Name = "";
    private int Shots = 0;
    private int Brains = 0;
    private int Survivors = 0;

    public String getName(){
        return Name;
    }

    public int getBrains() {
        return Brains;
    }

    public int getSurvivors() {
        return Survivors;
    }

    public int getShots() {
        return Shots;
    }
    public void setName(String A) {
        Name = A;
    }

    public void setBrains(int brains) {
        Brains = brains;
    }

    public void setShots(int shots) {
        Shots = shots;
    }

    public void setSurvivors(int survivors) {
        Survivors = survivors;
    }
}

