package demo1;

import java.util.Random;
import java.util.Scanner;

public class shuzu {
    public static void main(String[] args) {
//        int[] arr = {11,22};
//        double[] arr2 = {11.1,22.2,22.3,22.4,22.5,22.6};
//        System.out.println(arr[1]);
//        for (int i = 0; i <arr.length/*数组长度*/; i++) {
//            System.out.println(arr2[i]);
//        }
//        int sum = 0;
//        int[] arr ={1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i <arr.length; i++) {
////            System.out.println(arr[i]);
//            if (arr[i]%2==0){
//                arr[i]/=2;
//                System.out.println(arr[i]);
//            }else{
//                arr[i]*=2;
//                System.out.println(arr[i]);
//            }
//        }
//        System.out.println(sum);
//        char arr[] = new char[100];
//        Scanner s1 = new Scanner(System.in);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("请输入一个字符：");
//            char inputChar = s1.next().charAt(0);
//            arr[i] = inputChar;
//            System.out.println("您输入的字符为：" + arr[i]);
//        }
        int[] arr = {1,2,3,4,5};
        int max = arr[0];
        int temp ;
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

