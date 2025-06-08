package 인프런.s5;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        for (char c : sc.nextLine().toCharArray()) {
            if(c == ')'){
                while(true){
                    if(stack.pop() == '(')
                        break;
                }
            }
            else
                stack.push(c);
        }

        for (Character c : stack)
            System.out.print(c);
    }
}
