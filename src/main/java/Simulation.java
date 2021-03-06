public class Simulation {
    Dice gameDice;
    Bins gameBin;
    int numOfTimesThrown;


    public Simulation(int numDiceThrown,int numOfTimesThrown){
        this.gameDice = new Dice(numDiceThrown);
        this.numOfTimesThrown = numOfTimesThrown;
        gameBin = new Bins(numDiceThrown,numDiceThrown*6);
    }

    public void runSimulation(){
        for(int i=0;i<numOfTimesThrown;i++){
            gameBin.incrementBin(gameDice.tossAndSum());
        }
    }

    public void printResults(){
        gameBin.printBinContents(numOfTimesThrown);
    }


}
