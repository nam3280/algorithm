package 인프런.s3;

import java.util.Scanner;

public class 연속부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        int idx = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == M)
                count++;

            while(sum >= M) {
                sum -= arr[idx++];
                if(sum == M)
                    count++;
            }

        }

        System.out.println(count);
    }
}
