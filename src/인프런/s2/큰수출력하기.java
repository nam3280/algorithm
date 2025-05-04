package 인프런.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 큰수출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");

        System.out.print(arr[0] + " ");

        for (int i = 1; i < arr.length; i++) {
            if(Integer.parseInt(arr[i - 1]) < Integer.parseInt(arr[i]))
                System.out.print(arr[i] + " ");
        }
    }
}
