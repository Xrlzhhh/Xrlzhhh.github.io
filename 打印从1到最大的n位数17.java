package SuanFa;

import java.util.Arrays;

public class 打印从1到最大的n位数17 {

    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(printNumbers(n)));
    }
    public static int[] printNumbers(int n) {
        int endNumbers = 10;
        for (int i = 1; i < n; i++) {
            endNumbers*=10;
        }
        endNumbers-=1;
        int[] arr = new int[endNumbers];
        for (int i = 0; i<endNumbers;i++){
            arr[i]=i+1;
        }
        return arr;
    }
}
