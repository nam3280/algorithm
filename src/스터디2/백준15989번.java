package 스터디2;

import java.io.*;

public class 백준15989번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < T; k++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n + 1];

            arr[0] = 1;

            for (int i = 1; i <= 3; i++) {
                for (int j = i; j <= n; j++)
                    arr[j] += arr[j - i];
            }
            sb.append(arr[n]).append("\n");
        }

        System.out.print(sb);
    }
}
