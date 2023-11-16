package demo02;

import java.util.Scanner;

public class DuiXiang8_shuzu3 {
    public static void main(String[] args) {
        //定义长度为3的数组
        D4[] arr = new D4[3];

        //初始对象
        D4 St1 = new D4(001,"王小明",16);
        D4 St2 = new D4(002,"陈小黑",15);
        D4 St3 = new D4(003,"陈小白",15);

        //将学生添加进数组
        arr[0] = St1;
        arr[1] = St2;
        arr[2] = St3;

        //添加新对象
        D4 St4 = new D4(004,"张三",17);

        //对学生学号进行判断,办法二：（包含对数组增大判断）。
        // 由于冲突，放进新类——DuiXiang8_shuzu3
        boolean flag = contains(arr,St4.getXueHao());
        if (flag){
            //已存在，不用添加
            System.out.println("学号重复，请重新输入学号：");
        }else {
            //不存在，添加
            int shuZi = shuZi(arr);

            //数组存满，创建一个新数组，新数组长度=旧数组长度+1；
            if (shuZi == arr.length){
                
                D4[] arr1 = creatNewArr(arr);
                arr1[shuZi] = St4;
                print(arr1);

            }else {
                //数组未满，直接存入
                arr[shuZi] = St4;
                print(arr);
            }


        }
    }


    public static D4[] creatNewArr(D4[] arr) {
        D4[] newArr = new D4[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

//遍历
    public static void print(D4[] arr){

        for (int i = 0; i < arr.length; i++) {
            D4 St = new D4();
            St = arr[i];
            System.out.println(St.getXueHao()+" "+ St.getXingMing()+" "+St.getNianLing());
        }
    }
        //判断数组中存入了多少数字。存入新类
    public static int shuZi(D4[] arr) {
        int shuZi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                shuZi++;
            }
        }
        return shuZi;
    }

    //判断学生id是否重复
    public static boolean contains(D4[] arr,int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次获取到数组里面的每一个学生对象
            D4 St = arr[i];
            if (St != null){
                //获取数组中学生对象的id
                int sid = St.getXueHao();
                //比较
                if (sid == id){
                    return true;
                }
            }
        }
        return false;
    }
}
