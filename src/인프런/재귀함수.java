package 인프런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 재귀함수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dfs(N);
    }

    static void dfs(int N){
        if(N == 0)
            return ;

        dfs(N - 1);

        System.out.println(N);
    }
}

//dfs(3) -> dfs(2) -> dfs(1) -> dfs(0)
// return하면 stack에서 dfs(0)가 빠져나가고 dfs(1)의 sout 실행. 점점 올라가면서 반복(백트래킹)