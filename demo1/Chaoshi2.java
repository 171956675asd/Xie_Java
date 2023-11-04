package demo1;

import java.util.Scanner;

public class Chaoshi2 {
    public static void main(String[] args) {
        char op = 0;
        do {
            System.out.printf("\n\t欢迎进入天蠍超市线上购物平台");
            System.out.printf("\n编号\t\t\t商品名称\t\t\t价格（元）");
            System.out.printf("\n1\t\t\t牙刷\t\t\t\t8.8");
            System.out.printf("\n2\t\t\t毛巾\t\t\t\t10.0");
            System.out.printf("\n3\t\t\t水杯\t\t\t\t18.8");
            System.out.printf("\n4\t\t\t苹果\t\t\t\t12.5");
            System.out.printf("\n5\t\t\t香蕉\t\t\t\t15.5");
            System.out.printf("\n请选择要购买的商品的编号:");
            Scanner sr = new Scanner(System.in);
            int bh = sr.nextInt();
            double jiage;
            if (bh==1 || bh==2 || bh==3 || bh==4 || bh == 5){
                System.out.print("请输入要购买的数量：");
                Scanner shuliang = new Scanner(System.in);
                double shuliang1 = shuliang.nextDouble();
                switch (bh){
                    case 1:
                        jiage = shuliang1 * 8.8;
                        System.out.println("本次购买的总价为："+jiage);
                        break;
                    case 2:
                        jiage = shuliang1 * 10.0;
                        System.out.println("本次购买的总价为："+jiage);
                        break;
                    case 3:
                        jiage = shuliang1 * 18.8;
                        System.out.println("本次购买的总价为："+jiage);
                        break;
                    case 4:
                        jiage = shuliang1 * 12.5;
                        System.out.println("本次购买的总价为："+jiage);
                        break;
                    case 5:
                        jiage = shuliang1 * 15.5;
                        System.out.println("本次购买的总价为："+jiage);
                        break;
                    default:
                        System.out.println("超市没货了");
                        break;
                }
            }else{
                System.out.println("请输入正确的编号");
            }
            while (bh==1 || bh==2 || bh==3 || bh==4 || bh == 5){
                System.out.println("是否需要继续购买，需要请按'y'，不需要请按'n'");
                Scanner input = new Scanner(System.in);
                op = input.next().charAt(0);
                break;
            }

        } while ( op =='y');
    }
}
