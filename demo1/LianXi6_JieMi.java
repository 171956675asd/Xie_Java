package demo1;

public class LianXi6_JieMi {
    public static void main(String[] args) {
        //获取加密后的密码
        int[] arr = {4,3,2,7,6};
        //对密码反转
        int temp = 0;
        for (int i = 0 , j = arr.length - 1; i < j; i++ , j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        //获取密码%10前的数字
        // 0,1,2,3,4,5 ,6 ,7 ,8 ,9 (原数字）
        // 5,6,7,8,9,10,11,12,13,14 (+5后）
        // 5,6,7,8,9, 0, 1, 2, 3, 4 (%10后)
        for (int i = 0; i < arr.length; i++) {
            int f = arr[i];
            if (f<=4&&f>=0){
                f = f+10;
            }
            arr[i] = f;
        }

        //对每位数-5
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }
        //extracted(arr);//打印数组
        //打印密码
    }

    private static void extracted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
