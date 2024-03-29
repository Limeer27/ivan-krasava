import java.util.Random;

public class bibika {




    public class HWArray_carPrice {
        public static void main(String[] args){
            Random generatorRand = new Random();
            int[] cars = new int[50];
            int maxPrice = 0;
            for (int index = 0; index<cars.length; index++){
                cars[index] = generatorRand.nextInt(1,200);
                System.out.println(cars[index]);
                if (maxPrice<cars[index]){
                    maxPrice = cars[index];
                }
            }
            System.out.println("Максимальная цена авто: "+maxPrice);
        }
    }
}



