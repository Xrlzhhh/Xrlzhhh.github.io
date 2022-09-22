package SuanFa;

public class 旋转数组的最小数字11 {
    public static void main(String[] args) {
        int[] arr = {2,2,2,0,1};
        System.out.println(minArray(arr));
    }
    public static int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length-1;
        while (low<high){
            int mid = (low+high)/2;
            if (numbers[mid]<numbers[high]){
                high=mid;
            }else if (numbers[mid]>numbers[high]){
                low=mid+1;
            }else {
                high--;
            }
        }
        return numbers[low];
    }
}
