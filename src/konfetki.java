import java.util.Random;

public class konfetki {
    public static void main(String[] args){
        Random generatorRand = new Random();
        int[] candyPrice = new int[20];
        for (int index = 0; index<candyPrice.length; index++){
            candyPrice[index] = generatorRand.nextInt(1,100);
            System.out.println(candyPrice[index]);
        }

        int minPrice = candyPrice[0];
        for (int index = 0; index< candyPrice.length; index++){
            if (minPrice>candyPrice[index]){
                minPrice = candyPrice[index];
            }
        }
        System.out.println("минимальный прайс: " +minPrice);
    }
}

