package 인프런.s3;

import java.util.Scanner;

public class 최대매출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < M; i++)
            sum += arr[i];

        int max = sum;

        for (int i = M; i < N; i++) {
            sum = sum - arr[i - M] + arr[i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }

// 시간초과
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//
//        int[] arr = new int[N];
//        for (int i = 0; i < arr.length; i++)
//            arr[i] = sc.nextInt();
//
//        int max = 0;
//        int p1 = 0;
//        int p2 = M - 1;
//        while(p2 < N){
//            int sum = 0;
//            for (int i = p1; i <= p2; i++)
//                sum += arr[i];
//
//            if(max < sum)
//                max = sum;
//
//            p1++;
//            p2++;
//        }
//
//        System.out.println(max);
//    }
}