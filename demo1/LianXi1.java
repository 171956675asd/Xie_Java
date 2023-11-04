package demo1;

import java.util.Scanner;

public class LianXi1 {
    public static void main(String[] args) {
        int jiage;
        System.out.println("请输入机票原价：");
        Scanner sc = new Scanner(System.in);
        int yuanjia1 = sc.nextInt();
        System.out.println("请输入月份：");
        int yuefen1 = sc.nextInt();
        System.out.println("请选择头等舱(0)还是经济舱(1)：");
        int cangwei = sc.nextInt();
        if (yuefen1>=5&&yuefen1<=10){
            if (cangwei==0){
                jiage = (int)(yuanjia1*0.9);
                System.out.println("总价为："+jiage);
            } else if (cangwei==1) {
                jiage = (int)(yuanjia1*0.85);
                System.out.println("总价为："+jiage);
            }else {
                System.out.println("该舱位不存在");
            }
        }else if (yuefen1>=11&&yuefen1<=12||yuefen1>=1&&yuefen1<=4){
            if (cangwei==0){
                jiage = (int)(yuanjia1*0.7);
                System.out.println("总价为："+jiage);
            } else if (cangwei==1) {
                jiage = (int)(yuanjia1*0.65);
                System.out.println("总价为："+jiage);
            }else {
                System.out.println("该舱位不存在");
            }
        }else {
            System.out.println("该月份不存在");
        }

    }
}
