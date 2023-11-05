package demo1;

import java.util.Scanner;

public class LianXi5_JiaMi {
    public static void main(String[] args) {
        //1.使用数组存储密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码：");
        int number = sc.nextInt();//用于计算数组长度
        int number2 = number;//用于接收密码，并给予数组记录
        int shuzi = 0;//用于记录数组的长度
        while (number != 0) {
            number = number / 10;
            shuzi++;
        }
        int[] arr = new int[shuzi];
        int x = shuzi - 1;
        while (number2 != 0){
            int ge = 0;//用于接收密码的每一位数并存入数组。
            ge = number2 % 10;
            number2 /= 10;
            arr[x] = ge;
            x--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //2.对数组的每位数+5
        //extracted:让数组arr存入number2的数字。
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //3.随后%10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10 ;
        }
        //4.对数字进行反转
        int temp = 0;//temp用于数组内数组交换
        for (int i = 0 , j = arr.length - 1; i < j; i++,j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //5.打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


}

