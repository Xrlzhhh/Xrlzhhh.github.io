package ACMCodePattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arrays = new String[n];
        for (int i = 0; i < n; i++) {
            arrays[i]=sc.next();
        }
        if (isSorten1(arrays)&&isSorted2(arrays)){
            System.out.println("both");
        }else if (isSorten1(arrays)){
            System.out.println("lexicographically");
        }else if (isSorted2(arrays)){
            System.out.println("lengths");
        }else {
            System.out.println("none");
        }
    }
    public static boolean isSorten1(String[] arrays){
        for (int i = 0; i < arrays.length-1; i++) {
            if (arrays[i].compareTo(arrays[i+1])>0){
                return false;
            }
        }
        return true;
    }
    public static boolean isSorted2(String[] arrays){
        for (int i = 0; i < arrays.length-1; i++) {
            if (arrays[i].length()>arrays[i+1].length()){
                return false;
            }
        }
        return true;
    }
}
