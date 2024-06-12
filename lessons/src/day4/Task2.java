package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int numLength = 100;

        Random rand = new Random();
        int[] numbers = new int[numLength];

        for (int i = 0; i < numLength; i++)
            numbers[i] = rand.nextInt(1000);

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);


        int large = 0;
        for (int element : numbers) {
            if (element > large)
                large = element;
        }
        System.out.println("The largest number of array = " + large);

        int small = 1000;
        for (int element : numbers) {
            if (element < small)
                small = element;
        }
        System.out.println("The smallest number of array = " + small);

        int count = 0;


        for (int element : numbers) {
            if (element % 10 == 0 && element != 0)
                count ++;
                }
        int sum = 0;
        for (int element : numbers) {
            if (element % 10 == 0)
                sum += element;
        }
        int[] multipleOf10 = new int[count];
        int index = 0;
        for (int element : numbers) {
            if (element % 10 == 0 && element != 0)
                multipleOf10[index++] = element;

        }
        System.out.println(Arrays.toString(multipleOf10));
        System.out.println("Number of array elements ending with 0 = " + count);
        System.out.println("Sum of array elements ending with 0 = " + sum);
    }
}
