package demo1;

public class FangFa4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
//        copyOfRange(arr,3,7);
        int[] arr2 = copyOfRange(arr,3,7);//alt+ctrl+v直接生成左边接收
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    public static int[] copyOfRange(int[] arr,int from,int to) {
        int[] arr2 = new int[to-from];
        for (int i = 0; i < arr2.length; i++,from++) {
            arr2[i]=arr[from];

        }
        return arr2;
    }
}
