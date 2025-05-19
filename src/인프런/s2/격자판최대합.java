package 인프런.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class 격자판최대합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];

        for (int i = 0; i < arr.length; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] =  Integer.parseInt(input[j]);
            }
        }

        Integer[] rowArr = new Integer[N];
        Integer[] columnArr = new Integer[N];
        Integer[] diagonalArr = new Integer[2];

        Arrays.fill(rowArr, 0);
        Arrays.fill(columnArr, 0);
        Arrays.fill(diagonalArr, 0);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                columnArr[i] += arr[j][i];
                rowArr[i] += arr[i][j];

                if(i == j)
                    diagonalArr[0] += arr[i][j];

                if(j - i == N - 1)
                    diagonalArr[1] += arr[i][j];
            }
        }

        Arrays.sort(rowArr, Collections.reverseOrder());
        Arrays.sort(columnArr, Collections.reverseOrder());
        Arrays.sort(diagonalArr, Collections.reverseOrder());

        int max = Math.max(rowArr[0], Math.max(columnArr[0], diagonalArr[0]));

        System.out.println(max);
    }
}
