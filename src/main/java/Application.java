public class Application {

    public static void main(String[] args){
        Simulation testSim = new Simulation(2,10000);
        testSim.runSimulation();
        testSim.printResults();

    }

}
