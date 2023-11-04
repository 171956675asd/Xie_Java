package demo1;

public class fangfa2 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,77,55};
        int x =maxArr(arr);
        System.out.println(x);
    }

    public static int maxArr(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]){
                max = arr[i];
            }

        }
        System.out.println(max);
        return max;
    }



//    public static void shuZu(int c[]) {
//        System.out.print("[");
//        for (int i = 0; i < c.length; i++) {
//            if (i < c.length-1){
//                System.out.print(c[i]+",");
//            }else {
//                System.out.print(c[i]);
//            }
//        }
//        System.out.print("]");
//    }
}
