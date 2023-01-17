package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int numString = 10;
        int numColum = 15;
        int[][] numbers = new int[numString][numColum];

        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = rand.nextInt(50);
            }
        }

        System.out.println(Arrays.deepToString(numbers));

        int maxSum = 0;
        int indx = 0;
        for (int i = 0; i < numbers.length; i++){
            int sum = 0;
            for (int j = 0; j < numbers[i].length; j++){
                sum += numbers[i][j];
            }

            if (sum >= maxSum) {
                maxSum = sum;
                indx = i;
            }
        }
        System.out.println(indx);
    }
}
