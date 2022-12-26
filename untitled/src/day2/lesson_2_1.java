package day2;

import java.util.Scanner;
public class lesson_2_1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the quantity of floors ");
        int x = s.nextInt();
        if(x <= 0) {
            System.out.println("Wrong number");
        }
        else if (x < 5) {
            System.out.println("Low-rise house");
        }
        else if (x < 9) {
            System.out.println("Middle-rise house");
        }
        else  {
            System.out.println("Hi-rise house");
        }
    }
}


