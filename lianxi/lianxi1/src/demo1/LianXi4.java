package demo1;

import java.util.Scanner;

public class LianXi4 {
    public static void main(String[] args) {
        int arr[] = arr();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = getsum(arr);
        }
        System.out.println(sum);
    }

    public static int[] arr() {
        System.out.print("请六位评委输入各自的分数：");
        Scanner sc1 = new Scanner(System.in);
        //定义一个数组放入分数
        int arr[] = new int[6];
        for (int i = 0; i < arr.length; ) {
            int sc = sc1.nextInt();
            if (sc >= 0 && sc <= 100) {
                arr[i] = sc;
                i++;
            } else {
                System.out.println("请输入正确的分数");
            }

        }
        return arr;
    }

    //定义一个方法除去最高值与最低值
    //再定义一个方法获取分数总和
    public static int getsum(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int Sum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Sum = Sum + arr[i];
            if (max>arr[i]){
                max = arr[i];
            }
            if (min<arr[i]){
                min = arr[i];
            }
        }
        sum = (Sum-max-min)/4;
        return sum;
    }
}

//        int[] arr = {1,2,3,4,5};
//        int[] arr2 = new int[5];
//        String sc = " ";
//        for (int i = 0; i < 5; i++) {
//            arr2[i] =arr[i];
//            sc = sc + arr2[i];
//        }
//        System.out.println(sc);