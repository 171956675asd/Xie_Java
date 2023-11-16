package demo02;

import java.util.Scanner;

public class DuiXiang7_shuzu3 {
    public static void main(String[] args) {
        //定义长度为3的数组
        D4[] arr = new D4[3];

        //初始对象
        D4 St1 = new D4(001,"王小明",16);
        D4 St2 = new D4(002,"陈小黑",15);

        //将学生添加进数组
        arr[0] = St1;
        arr[1] = St2;
        
        //再次添加一个对象
        //键盘录入学生信息
        Scanner sc = new Scanner(System.in);
        D4 St3 = new D4();
        System.out.println("请输入学生学号：");
        int xueHao = sc.nextInt();
        St3.setXueHao(xueHao);
        //对学生学号进行判断,办法二：由于冲突，放进新类——DuiXiang8_shuzu3

        //对学生学号进行判断,办法一：
        for (int i = 0; i < 2; ) {
            if (St3.getXueHao() == arr[i].getXueHao()){
                System.out.println("学号重复，请重新输入学号：");
                int xueHao1 = sc.nextInt();
                St3.setXueHao(xueHao1);
                i=0;
            }else {
                i++;
            }
        }

        System.out.println("请输入学生姓名：");
        String xingMing = sc.next();
        St3.setXingMing(xingMing);

        System.out.println("请输入学生年龄：");
        int nianLing = sc.nextInt();
        St3.setNianLing(nianLing);

        //将新对象添加进数组
        int shuzi = shuZi(arr);
        if (shuzi == arr.length){
            //数组存满
            //创建新数组接受数据
            D4[] newArr = newArr(arr);
            newArr[shuzi] = St3;
            //遍历所有学生信息
//            print(newArr);
            

        }else {
            //数组未满
            arr[shuzi] = St3;
            //遍历所有学生信息
//            print(arr);
        }

        //通过id删除学生信息（若存在则删除，不存在则删除失败）

    }

    public static void print(D4[] arr) {
        for (int i = 0; i < arr.length; i++) {
            D4 St = new D4();
            St = arr[i];
            System.out.println(St.getXueHao()+" "+St.getXingMing()+" "+St.getNianLing());
        }
    }
    //创建新数组
    public static D4[] newArr(D4[] arr){
        D4[] newArr = new D4[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    
    //判断数组内有多少数据
    public static int shuZi(D4[] arr) {
        int shuzi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                shuzi++;
            }
        }
        return shuzi;
    }
}
