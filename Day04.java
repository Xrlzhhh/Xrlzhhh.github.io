package month3;

import java.util.*;

import static month3.Day02.helper;

public class Day04 {
    static int[] w = {0,31,28,31,30,31,30,31,31,30,31,30,31};//每月天数,判断是否合法
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       boolean flag = true;
       int n = scanner.nextInt();
       for (int i = n+1; ; i++){
           char[] s = (i+"").toCharArray();
           if (s[0]==s[7] && s[1] == s[6] && s[2] == s[5] && s[3] == s[4] && check(i+"")){
               if (flag){
                   System.out.println(i);
                   flag = false;
               }
               if (s[0] == s[2] && s[1] == s[3]){
                   System.out.println(i);
                   break;
               }
           }
       }
    }
    static boolean check(String s){
        int year = Integer.parseInt(s.substring(0,4));
        int month = Integer.parseInt(s.substring(4,6));
        int day = Integer.parseInt(s.substring(6));
        //判断闰年
        if (year%4==0 && year%100!=0 || year%400==0){
            w[2] = 29;
        }
        if (month > 12) return false;
        if (day > w[month]) return false;
        return true;
    }
    public static boolean helper03(int num){
        String s = "" + num;
        int l = 0;
        int r = s.length()-1;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < r; i++) {
            set.add(s.charAt(i));
        }
        if (set.size()!=2) return false;
        while (l < r){
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);
            if (ch1!=ch2) return false;
            if (l > 0){
                if (ch1 == s.charAt(l-1)) return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int ans = 0;
        for (int i = 2333333; i <=23333333 ; i++) {
            int temp = i;
            int x = 0;
            for(int j=2; j<=Math.sqrt(temp); j++){
                if (temp % j == 0){
                    while (temp % j ==0){
                        temp/=j;
                        x++;
                    }
                }
            }
            if (temp > 1) x++;
            if (x == 12) ans++;
        }
        System.out.println(ans);
        scan.close();
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        for (int i = 363;  ; i++) {
            int sum = (i + 1) * i / 2;
            if (sum > 20220514 && helper01(sum)){
                System.out.println(sum);
                break;
            }
        }
        scan.close();
    }
    public static boolean helper02(int num){
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean helper01(int num){
        String s = "" + num;
        int l = 0;
        int r = s.length()-1;
        while (l < r){
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);
            if (ch1 != ch2) return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            int j = scanner.nextInt();
            set.add(j);
        }
        for(Integer i : set){
            System.out.println(i);
        }
    }
}
