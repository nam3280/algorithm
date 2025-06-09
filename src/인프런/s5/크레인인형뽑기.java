package 인프런.s5;

import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N][N];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++)
                board[i][j] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] moves = new int[M];
        for (int i = 0; i < moves.length; i++)
            moves[i] = sc.nextInt();

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[j][moves[i] - 1] != 0) {
                    int temp = board[j][moves[i] - 1];
                    board[j][moves[i] - 1] = 0;
                    if(!stack.isEmpty() && temp == stack.peek()){
                        answer += 2;
                        stack.pop();
                    }
                    else
                        stack.push(temp);
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
