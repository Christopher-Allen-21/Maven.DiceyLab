public class Dice {
    private int numOfDice;

    public Dice(int numOfDice){
        this.numOfDice = numOfDice;
    }

    public int tossAndSum(){
        int sum = 0;
        for(int i=1;i<=numOfDice;i++){
            sum += Math.floor(Math.random()*6)+1;
        }

        return sum;
    }

    public int getNumOfDice(){
        return numOfDice;
    }

}
