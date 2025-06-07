package 인프런.s5;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        String answer = "";
        for (int i = 0; i < input.length; i++) {
            if(input[i] == '(')
                stack.push(input[i]);
            else {
                if(stack.empty()) {
                    answer = "NO";
                    break;
                }
                else
                    stack.pop();
            }
        }
        if(stack.empty() && answer.isEmpty())
            answer = "YES";
        else
            answer = "NO";

        System.out.println(answer);
    }
}
