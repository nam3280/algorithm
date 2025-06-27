package 인프런.s5;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] arr = input.toCharArray();

        Stack<Character> stack = new Stack<>();

        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == '(')
                stack.push(arr[i]);
            else{
                stack.pop();
                if(arr[i - 1] == '(')
                    answer += stack.size();
                else
                    answer ++;
            }
        }

        System.out.println(answer);
    }
}
