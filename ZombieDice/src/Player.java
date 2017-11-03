public class Player {

    public Player(){

    }

    private String Name = "";
    private int Shots = 0;
    private int Brains = 0;
    private int Survivors = 0;

    public void   setName(String A) {
        Name = A;
    }
    public String getName(){
        return Name;
    }

    public void   setBrains(int brains) {
        Brains = brains;
    }
    public int    getBrains() {
        return Brains;
    }

    public void   setSurvivors(int survivors) {
        Survivors = survivors;
    }
    public int    getSurvivors() {
        return Survivors;
    }

    public void   setShots(int shots) {
        Shots = shots;
    }
    public int    getShots() {
        return Shots;
    }


}

