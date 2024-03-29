import java.util.Random;

public class vozrast {
    public static void main(String[] args){
        Random generatorRand = new Random();
        int[] years = new int[30];
        for (int index = 0; index<years.length; index++){
            years[index] = generatorRand.nextInt(1900,2024);
            System.out.println(years[index]);
        }

        int maxYear = years[0];
        int minYear = years[0];
        for (int index = 0; index< years.length; index++){
            if (maxYear<years[index]){
                maxYear = years[index];
            }
            if (minYear>years[index]){
                minYear = years[index];
            }
        }
        System.out.println("самый стврый скуф (" + maxYear + "г.р.) старше самого молодого ("+ minYear + "г.р.) на " + (maxYear - minYear));
    }
}

