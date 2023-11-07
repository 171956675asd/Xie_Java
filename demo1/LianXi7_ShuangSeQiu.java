package demo1;

import java.util.Random;

public class LianXi7_ShuangSeQiu {
    public static void main(String[] args) {
//        //设置5个金额
//        int jiang1 = 2;
//        int jiang2 = 588;
//        int jiang3 = 888;
//        int jiang4 = 1000;
//        int jiang5 = 10000;
        //设置一个数组接收金额
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] arr2 = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < 5; ) {
            int c = r.nextInt(arr.length);
            if (!chongFu(arr2,arr[c])){
                arr2[i] = arr[c];
                i++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
    //该方法用于检查奖项是否重复
    public static boolean chongFu(int[] arr,int jiangjin) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == jiangjin){
                return true;//金额不可用
            }
        }
        return false;//金额可用
    }
}