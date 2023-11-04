package demo1;

import java.util.Random;

public class LianXi3 {
    public static void main(String[] args) {
        //定义一个char数组
        //放入52个字母
        //取4个随机索引
        char[] arr = new char[52];
        for (int i = 0; i < 52; i++) {
            if (i < 26) {
                arr[i] = (char) (65 + i);
            } else if (i >= 26) {
                arr[i] = (char) (97 + i - 26);
            }
        }
        String shuchu = " ";
        Random r = new Random();
        for (int c = 0; c < 4; c++) {
            int sc = r.nextInt(arr.length);
            shuchu = shuchu + arr[sc];
        }
        //放入10个数字
        //字符串拼接成四字母加一数字
        int sb = r.nextInt(10);
        shuchu = shuchu + sb;
        System.out.println(shuchu);





//        for (char b = 1; b <= 10; b++) {
//            int x = 52+b;
//            arr [x] = (char)(48+b);
//        }
//        System.out.println(arr);


//        int count = 0;
//        //循环101~200
//        for (int i = 101; i < 200; i++) {
//            boolean r = true;
//            //找质数
//            for (int j = 2; j < i/2; j++) {
//                if (i%j==0){
//                    r=false;
//                    break;
//                }
//            }
//            //输出质数
//            if (r){
//                System.out.println(i+"是质数");
//                count++;
//            }
//
//            //输出质数个数
//
//        }
//        System.out.println(count);
    }
}
