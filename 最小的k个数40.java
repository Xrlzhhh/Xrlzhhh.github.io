package SuanFa;

import java.util.Arrays;

public class 最小的k个数40 {

    public static void main(String[] args) {
        int[] arr = {6};
        System.out.println(Arrays.toString(getLeastNumbers(arr,1)));
    }
    public static int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length==0 || arr.length==1){
            return arr;
        }
        Arrays.sort(arr);
        int[] num = new int[k];
        for (int i = 0; i <k ; i++) {
            num[i]=arr[i];
        }
        return num;
    }
}
