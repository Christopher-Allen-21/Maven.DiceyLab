import java.util.ArrayList;
import java.util.HashMap;

public class Bins {
    HashMap<Integer,Integer> bin = new HashMap<Integer, Integer>();

    public Bins(int min,int max){
        for(int i=min; i<=max; i++){
            bin.put(i,0);
        }
    }

    public void incrementBin(int binNumber){
        bin.put(binNumber,bin.get(binNumber)+1);
    }

    public void printBinContents(int numTimesThrown){
        for(int i : bin.keySet()){
            double percentage = (bin.get(i)*100.0f) / numTimesThrown;
            System.out.printf("Key: %s   Value: %s   Percentage: %.2f%%\n",i,bin.get(i),percentage);
        }
    }

}
