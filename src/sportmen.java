import java.util.Random;

public class sportmen {
    public static void main(String[] args){
        Random generatorRand = new Random();
        double[] raceResult = new double[25];
        for (int index = 0; index<raceResult.length; index++){
            raceResult[index] = generatorRand.nextDouble(1.0,5.0);
            System.out.println(raceResult[index]);
        }

        int startPosition = 0;
        double winnerTime = raceResult[startPosition];

        for (int index = 0; index< raceResult.length; index++){
            if (winnerTime>raceResult[index]){
                winnerTime = raceResult[index];
                startPosition = index;
            }
        }
        System.out.println("время победителя " +winnerTime);
        System.out.println("стартовал позицией: " +startPosition);
    }
}

