package 인프런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 재귀함수이진수출력 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dfs(N);
    }

    static void dfs(int N){
        if(N == 0)
            return ;

        int num = N % 2;

        N /= 2;

        dfs(N);

        System.out.print(num);
    }
}
