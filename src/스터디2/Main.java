package 스터디2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[10000];

        for (int i = 1; i < 4; i++) {
            for (int j = i; j < arr.length; j++)
                arr[j] += arr[j - i];
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < num; k++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[n]).append("\n");
        }

        System.out.print(sb);
    }
}