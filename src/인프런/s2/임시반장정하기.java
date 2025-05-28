package 인프런.s2;

import java.util.*;
public class 임시반장정하기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N + 1][6];

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= 5; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        int max = 0;

        for(int i = 1; i <= N; i++){
            int cnt = 0;
            for(int j = 1; j <= N; j++){
                for(int k = 1; k <= 5; k++){
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }

        System.out.println(answer);
    }
}