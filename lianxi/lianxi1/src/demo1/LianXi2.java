package demo1;

public class LianXi2 {
    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 101; i < 200; i++) {
//            boolean flag = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j ==0){
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag){
//                System.out.println("当前数字"+i+"是质数");
//                count++;
//            }
//        }
//        System.out.println("一共有"+count+"个质数");

        int shuliang = 0;
        //101~200
        for (int i = 101; i <= 200; i++) {
            boolean r = true;
            //找质数
            for (int j = 2; j < i/2; j++) {
                if (i%j==0){
                    r = false;
                    break;
                }

            }
            if (r){
                System.out.println(i+"是质数");
                shuliang++;
            }

        }
        System.out.println(shuliang+"个质数");
    }
}
