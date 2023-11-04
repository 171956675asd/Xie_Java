package demo1;

public class fangFa3 {
    public static void main(String[] args) {
        int a = 10;
        int[] arr = {11,22,33,44,10};
        boolean x = Arr(a,arr);
        System.out.println(x);
    }

    public static boolean Arr(int a,int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a ){
                return true;
            }
        }
        return false;
    }
}
