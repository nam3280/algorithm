package 인프런.s2;

import java.util.Scanner;

public class 멘토링 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[M][N];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();
        }

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int count = 0;
                for (int k = 0; k < M; k++) {
                    int pi = 0;
                    int pj = 0;
                    for (int s = 0; s < N; s++) {
                        if(arr[k][s] == i)
                            pi = s;
                        if(arr[k][s] == j)
                            pj = s;
                    }
                    if(pi < pj)
                        count++;
                }

                if(count == M)
                    answer++;
            }
        }

        System.out.println(answer);
    }
}
