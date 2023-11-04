package demo1;

public class FangFa5 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change前number="+number);
        number = change(number);
        System.out.println("调用change前number="+number);
    }

    public static int change(int a) {
        a = 200;
        return a;
    }
}
