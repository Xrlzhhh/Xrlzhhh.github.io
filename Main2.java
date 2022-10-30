package ACMCodePattern;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int M = sc.nextInt();
        if (M==0){
            System.out.println(0);
            return;
        }
        if(M<0){
            M = Math.abs(M);
            flag=true;
        }
        int N = sc.nextInt();
        String table = "0123456789ABCDEF";
        StringBuilder stringBuilder = new StringBuilder();
        while (M!=0){
            int x = M%N;
            stringBuilder.append(table.charAt(x));
            M/=N;
        }
        String res = stringBuilder.reverse().toString();
        if (flag){
            System.out.println("-"+res);
        }else {
            System.out.println(res);
        }

    }
}
