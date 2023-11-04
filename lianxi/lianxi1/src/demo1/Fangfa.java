package demo1;

import java.util.Random;
import java.util.Scanner;

public class Fangfa {
    public static void main(String[] args) {
//        int p = fangFa(10,20);
//        System.out.println(p);
//        System.out.println(fangFa(10,20));
        int sum = fangFa2();
        System.out.println("给你五次机会请猜出随机数");
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入随机数:");
            Scanner r = new Scanner(System.in);
            int c = r.nextInt();
            if (c < sum) {
                System.out.println("小了");
            } else if (c > sum) {
                System.out.println("大了");
            }
            if (i==5){
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }

    public static int fangFa(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int fangFa2() {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        return number;
    }
}
