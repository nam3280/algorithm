package 인프런.s2;

import java.util.Arrays;
import java.util.Scanner;

public class 봉우리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        int[][] arr = new int[N + 2][N + 2];

        for (int i = 0; i < arr.length; i++)
            Arrays.fill(arr[i], 0);

        for (int i = 1; i < arr.length - 1; i++) {
            int idx = 0;
            String[] input = sc.nextLine().split(" ");
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = Integer.parseInt(input[idx]);
                idx++;
            }
        }

        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                if(arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i][j + 1] &&
                        arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j])
                    count++;
            }
        }

        System.out.println(count);
    }
}
