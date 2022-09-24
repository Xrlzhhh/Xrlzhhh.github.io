package SuanFa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 和为s的两个数字57 {

    public static void main(String[] args) {
        int[] arr = {10,26,30,31,47,60};
        int target = 40;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            if (!set.contains(target-x)){
                set.add(x);
            }else {
                return new int[]{x,target-x};
            }
        }
        return new int[0];
    }
}
