package 인프런.s5;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] arr = input.toCharArray();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= '*' && arr[i] <= '/'){
                int num1 = stack.pop();
                int num2 = stack.pop();
                int result = 0;
                switch (arr[i]){
                    case '*' -> result = num2 * num1;
                    case '/' -> result = num2 / num1;
                    case '+' -> result = num2 + num1;
                    case '-' -> result = num2 - num1;
                }

                stack.push(result);
            }

            else
                stack.push(arr[i] - '0');
        }

        System.out.println(stack.pop());
    }
}
