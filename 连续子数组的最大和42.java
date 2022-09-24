package SuanFa;

import java.util.Arrays;

public class 连续子数组的最大和42 {

    public static void main(String[] args) {
        int[] num = {2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(num));
    }
    public static int maxSubArray(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        int dp = nums[0];
        int maxNum = dp;
        for (int i = 1; i <nums.length ; i++) {
            dp=nums[i]+(dp>0?dp:0);
            maxNum=Math.max(maxNum,dp);
        }
        return maxNum;
    }
}
