package ACMCodePattern;

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        int count = 0;
        int i = 0;
        while (i<n){
            if (arr[i]<arr[i+1]){
                while (i<n && arr[i]<arr[i+1]){
                    i++;
                }
                i++;
                count++;
            }else if (arr[i]==arr[i+1]){
                i++;
            }else {
                while (i<n && arr[i]>arr[i+1]){
                    i++;
                }
                i++;
                count++;
            }
        }
        System.out.println(count);
    }
}