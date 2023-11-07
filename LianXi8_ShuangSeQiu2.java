package demo1;

import java.util.Random;
import java.util.Scanner;


public class LianXi8_ShuangSeQiu2 {
    public static void main(String[] args) {
        //打印中奖号码
        int arr[] = zhongJiang();
        System.out.print("中奖号码为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //红,蓝球号码
        int[] arr2 = new int[7];
        extracted(arr2);//输入红，蓝球号码方法
        System.out.print("您的号码为：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        //判断红，蓝球中奖个数
        //一等奖：6红+1蓝：1000W
        //二：6红+0蓝；500W
        //三：5红+1蓝：3000
        //四：5+0，4+1：200
        //五：4+0，3+1：10
        //六：2+1,1+1,0+1:5
        int xiangTongRed = 0;
        for (int i = 0; i < 6; i++) {
            if (arr2[i] == arr[i]){
                xiangTongRed++;
            }
        }
        int xiangTongBlue = 0;
        if (arr2[6] == arr[6]){
            xiangTongBlue++;
        }
        jiDeng(xiangTongRed,xiangTongBlue);
    }



    //该方法用于判断中几等奖
    private static void jiDeng(int Red , int Blue){
        if (Red==6&&Blue==1){
            System.out.println("恭喜你，中了一等奖，获得了1000W元");
        } else if (Red==6&&Blue==0) {
            System.out.println("恭喜你，中了二等奖，获得了500W元");
        }else if (Red==5&&Blue==1) {
            System.out.println("恭喜你，中了三等奖，获得了3000元");
        }else if (Red==5&&Blue==0 || Red==4&&Blue==1) {
            System.out.println("恭喜你，中了四等奖，获得了200元");
        }else if (Red==4&&Blue==0 || Red==3&&Blue==1) {
            System.out.println("恭喜你，中了五等奖，获得了10元");
        }else if (Red==2&&Blue==1 || Red==1&&Blue==1 || Red==0&&Blue==1) {
            System.out.println("恭喜你，中了六等奖，获得了5元");
        }else {
            System.out.println("恭喜你，是个倒霉蛋，什么都没中");
        }
    }
    //该方法用于输入红，蓝球号码
    private static int[] extracted(int[] arr) {
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.print("请输入第" + (i + 1) + "个红球的数字：");
            int shuZi = sr.nextInt();
            if (shuZi >= 1 && shuZi <= 33) {
                if (!chongFu(arr, shuZi)) {
                    arr[i] = shuZi;
                    i++;
                } else {
                    System.out.println("输入错误，请重新输入");
                }
            } else {
                System.out.println("输入错误，请重新输入");
            }
        }
        System.out.print("请输入蓝球的数字：");
        for (int i = 0; i < 1; ) {
            int shuZi = sr.nextInt();
            if (shuZi >= 1 && shuZi <= 16) {
                arr[arr.length - 1] = shuZi;
                i++;
            } else {
                System.out.println("输入错误，请重新输入：");
            }
        }

        return arr;
    }





    //该方法用于生成中奖号码
    public static int[] zhongJiang() {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            int red = r.nextInt(33) + 1;
            if (!chongFu(arr, red)) {
                arr[i] = red;
                i++;
            }
        }
        int blue = r.nextInt(16) + 1;
        arr[arr.length - 1] = blue;
        return arr;
    }





    //该方法用于判断是否有重复数字
    public static boolean chongFu(int[] arr, int shuzi) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == shuzi) {
                return true;//数字无效
            }
        }
        return false;//数字有效
    }
}