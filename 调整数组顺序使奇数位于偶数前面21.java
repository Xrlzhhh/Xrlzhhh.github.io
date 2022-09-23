package SuanFa;

import java.util.Arrays;

public class 调整数组顺序使奇数位于偶数前面21 {

    public static void main(String[] args) {
        int[] arr = {1,7};
        System.out.println(Arrays.toString(exchange(arr)));
    }
    public static int[] exchange(int[] nums) {
        if (nums.length==0||nums.length==1){
            return nums;
        }
        int[] arr1 = new int[nums.length];//存放奇数
        int[] arr2 = new int[nums.length];//存放偶数
        int length = nums.length;
        int count1 = 0;//记录奇数的个数
        int j = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2!=0){
                arr1[j]=nums[i];// 1 3 5
                j++;
                count1++;
            }else {
                arr2[k]=nums[i];//6
                k++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            nums[i]=arr1[i];
        }
        int N = length-count1;//偶数的个数
        for (int i=0;i<N ;i++){
            nums[count1]=arr2[i];
            count1++;
        }
        return nums;
    }
}
