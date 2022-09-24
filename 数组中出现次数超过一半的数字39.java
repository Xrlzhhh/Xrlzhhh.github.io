package SuanFa;

import java.util.HashMap;
import java.util.Map;

public class 数组中出现次数超过一半的数字39 {

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        int n = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            if (!map.containsKey(x)){
                map.put(x,1);
            }else {
                map.put(x,map.get(x)+1);
                if (map.get(x)>n){
                    return x;
                }
            }
        }
        return -1;//可有可无
    }
}
