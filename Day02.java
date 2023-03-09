package month3;

import java.util.Scanner;

public class Day02 {


    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                sum += arr[i] * arr[j];
            }
        }
        System.out.println(sum);
        scan.close();
    }

    public static void main2(String[] args) {
        for (int i=1;;i++){
            int count = 0;
            for (int j = 1; j <=i ; j++) {
                if (i % j == 0) count++;
                if (count == 100){
                    System.out.println(i);
                    return;
                }
            }
        }
    }
    public static boolean helper(int num){
        String s = "" + num;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='1' ||ch=='3'||ch=='5'||ch=='7'||ch=='9'){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }



























    public static void main1(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int a = 1;
        int b = 1;
        int c = 1;
        for(int i=4; i<=20190324; i++){
            int temp = (a+b+c)%10000;
            a = b;
            b = c;
            c = temp;
        }
        System.out.println(c);
        scan.close();*/
        /*Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int count = 1;
        for(int i=3; i<Integer.MAX_VALUE; i+=2){
          //质数必然是奇数
          if (isZhi(i)){
              count++;
              if (count == 2019){
                  System.out.println(i);
                  break;
              }
          }
        }
        scan.close();*/
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int yinliao = scan.nextInt();
        int count = yinliao;
        int pingzi = yinliao;
        while (pingzi >= 3){
            count+=pingzi/3;
            int a = pingzi%3;
            pingzi = pingzi/3;
            pingzi += a;
        }
        System.out.println(count);
        scan.close();
    }

    public static boolean isZhi(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
