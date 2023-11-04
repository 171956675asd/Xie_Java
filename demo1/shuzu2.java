package demo1;

import java.util.Random;

public class shuzu2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
//        Random r = new Random();
//        int number = r.nextInt(100)+1;


        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int number = r.nextInt(100)+1;
            arr[i] = number;
//            System.out.println(number);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
