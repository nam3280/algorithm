package 인프런.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 특정문자뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();

        int left = 0;
        int right = input.length - 1;

        while(left < right) {
            if (!Character.isAlphabetic(input[left]))
                left++;

            else if (!Character.isAlphabetic(input[right]))
                right--;

            else{
                char temp = input[left];
                input[left] = input[right];
                input[right] = temp;
                left++;
                right--;
            }
        }

        for(char c : input)
            System.out.print(c);
    }
}
