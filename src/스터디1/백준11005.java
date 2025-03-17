package 스터디1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        if(N == 0)
            sb.append(0);

        else {
            char[] arr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

            while (N > 0) {
                sb.insert(0, arr[N % T]);
                N /= T;
            }
        }

        System.out.print(sb);
    }
}
