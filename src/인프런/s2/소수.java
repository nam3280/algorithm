package 인프런.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];

        int count = 0;
        for (int i = 2; i <= N; i++) {
            if(arr[i] == 0)
                count++;
            for (int j = i; j <= N; j = j + i) {
                if(i % j != 0)
                    arr[j] = 1;
            }
        }

        System.out.println(count);
    }
}
