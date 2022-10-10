package 算法题;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "I like beijing.";
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch!=' '){
                stringBuilder.append(ch);
            }else {
                arrayList.add(stringBuilder.toString());
                stringBuilder.delete(0,stringBuilder.length());
            }
        }
        arrayList.add(stringBuilder.toString());
        StringBuilder result = new StringBuilder();
        for (int i = arrayList.size()-1; i >=0 ; i--) {
            result.append(arrayList.get(i));
            result.append(' ');
        }
        result.deleteCharAt(result.length()-1);
        System.out.println(result.toString());

    }
}
