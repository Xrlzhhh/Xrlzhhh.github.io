package 算法题;

import java.util.Scanner;
//126987
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=scanner.nextInt();
        }
        int result = 0;
        int slow = 0;
        int fast = 1;
        int flag = 0;//0代表相等 1代表递增 -1代表递减
        for (int j=1;j<arr.length;j++){
            if (arr[j]>arr[j-1]){
                if (flag==0) flag=1;
                else if (flag==-1){
                    flag=0;
                    result++;
                }
            }
            if (arr[j]<arr[j-1]){
                if (flag==0) flag=-1;
                else if (flag==1){
                    flag=0;
                    result++;
                }
            }
        }
        result++;
        System.out.println(result);

    }
}
