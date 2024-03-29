import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int[][] array = new int[6][8];
        System.out.println();
        Random generatorRand = new Random();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                array[row][col] = generatorRand.nextInt(-100, 100);
            }
        }
        int maxElement = array[0][0];
        int minElement = array[0][0];
        int preMax = -101;
        int preMin = 101;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                System.out.print(array[row][col] + " ");
                if (maxElement < array[row][col]) {
                    preMax = maxElement;
                    maxElement = array[row][col];
                } else if (array[row][col] > preMax && array[row][col] != maxElement) {
                    preMax = array[row][col];
                }

                if (minElement > array[row][col]) {
                    preMin = minElement;
                    minElement = array[row][col];
                } else if (array[row][col] < preMin && array[row][col] != minElement) {
                    preMin = array[row][col];
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Максимальный элемент: " + maxElement);
        System.out.println("Минимальный элемент: " + minElement);
        System.out.println("2 максимальный элемент: " + preMax);
        System.out.println("2 минимальный элемент: " + preMin);
    }
}



