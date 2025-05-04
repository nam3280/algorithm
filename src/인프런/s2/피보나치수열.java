package 인프런.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            if(i < 2)
                arr[i] = 1;
            else
                arr[i] = arr[i - 2] + arr[i - 1];

            System.out.print(arr[i] + " ");
        }
    }
}
