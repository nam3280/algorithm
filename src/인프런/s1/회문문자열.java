package 인프런.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 회문문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toUpperCase().toCharArray();

        boolean same = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if(arr[i] != arr[arr.length - 1 - i])
                same = false;
        }

        System.out.println(same ? "YES" : "NO");
    }
}
