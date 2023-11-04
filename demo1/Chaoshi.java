package demo1;

import java.util.Scanner;

public class Chaoshi {
    public static void main(String[] args) {

                char op =0;
                do {
                    System.out.printf("\n\t欢迎进入讯猫超市线上购物平台");
                    System.out.printf("\n编号\t\t\t商品名称\t\t\t价格（元）");
                    System.out.printf("\n1\t\t\t牙刷\t\t\t\t8.8");
                    System.out.printf("\n2\t\t\t毛巾\t\t\t\t10.0");
                    System.out.printf("\n3\t\t\t水杯\t\t\t\t18.8");
                    System.out.printf("\n4\t\t\t苹果\t\t\t\t12.5");
                    System.out.printf("\n5\t\t\t香蕉\t\t\t\t15.5");
                    System.out.printf("\n请选择要购买的商品的编号:");
                    Scanner sp = new Scanner(System.in);
                    int choice = sp.nextInt();
                    int number=0;
//        if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5)
//            System.out.printf("请输入正确的编号！\n");
                    if(choice == 1|| choice == 2 || choice == 3|| choice == 4 ||choice == 5)
                    {System.out.printf("请输入购买的数量：");
                        Scanner num = new Scanner(System.in);
                        number = num.nextInt();}
                    switch (choice) {
                        case 1:
                            double sum1;
                            sum1 = number * 8.8;
                            System.out.printf("购买牙刷%d个，合计%2.2f元。\n", number, sum1);
                            break;
                        case 2:
                            double sum2;
                            sum2 = number * 10.0;
                            System.out.printf("购买毛巾%d个，合计%2.2f元。\n", number, sum2);
                            break;
                        case 3:
                            double sum3;
                            sum3 = number * 18.8;
                            System.out.printf("购买水杯%d个，合计%2.2f元。\n", number, sum3);
                            break;
                        case 4:
                            double sum4;
                            sum4 = number * 12.5;
                            System.out.printf("购买苹果%d个，合计%2.2f元。\n", number, sum4);
                            break;
                        case 5:
                            double sum5;
                            sum5 = number * 15.5;
                            System.out.printf("购买香蕉%d根，合计%2.2f元。\n", number, sum5);
                            break;
                        default:
                            System.out.printf("请输入正确的编号！\n");
                            break;
                    }

                    while (choice ==1||choice ==2||choice ==3||choice ==4||choice ==5)
                    {
                        System.out.printf("继续购物请输入Y，否则请输入N：");
                        Scanner input = new Scanner(System.in);
                        op = input.next().charAt(0);
                        break;
                    }
                    //op=scanner.next().charAt(0);
                } while (op == 'Y');
            }
        }