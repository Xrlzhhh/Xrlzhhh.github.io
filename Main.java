package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[3*n];
        for (int i = 0; i < 3*n; i++) {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        long sum = 0;
        for (int i = n; i <3*n ; i+=2) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
