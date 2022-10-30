package CoreCodePattern;

import java.util.Scanner;

public class t02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        t02 tool = new t02();
        System.out.println(tool.checkWon(arr));
    }
    public boolean checkWon(int[][] board) {
        // write code here
        if (board[1][1]==1){
            if (board[0][0]==1 && board[2][2]==1 || board[0][2]==1 && board[2][0]==1){
                return true;
            }
        }//对角线胜利情况
        //横竖胜利情况
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]==1){
                    //横的情况
                    int k = 0;
                    for (; k < 3; k++) {
                        if (board[i][k]==1){
                            continue;
                        }else {
                            break;
                        }
                    }
                    if (k==3) return true;
                    //竖的情况
                    k=0;
                    for (; k < 3; k++) {
                        if (board[k][j]==1){
                            continue;
                        }else {
                            break;
                        }
                    }
                    if (k==3) return true;
                }
            }
        }
        return false;
    }
}
