package 인프런.s3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 두배열합치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = sc.nextInt();

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = sc.nextInt();

        int[] answer = new int[N + M];

        for (int i = 0; i < arr1.length; i++)
            answer[i] = arr1[i];

        for (int i = 0; i < arr2.length; i++)
            answer[i + N] = arr2[i];

        Arrays.sort(answer);

        for (int i = 0; i < answer.length; i++)
            System.out.print(answer[i] + " ");
    }

//투 포인터
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr1 = new int[N];
//        for(int i = 0; i < N; i++)
//            arr1[i] = sc.nextInt();
//
//        int M = sc.nextInt();
//        int[] arr2 = new int[M];
//        for(int i = 0; i < M; i++)
//            arr2[i] = sc.nextInt();
//
//        ArrayList<Integer> answer = new ArrayList<>();
//
//        int p1 = 0;
//        int p2 = 0;
//        while(p1 < N && p2 < M){
//            if(arr1[p1]< arr2[p2])
//                answer.add(arr1[p1++]);
//            else
//                answer.add(arr2[p2++]);
//        }
//        while(p1< N)
//            answer.add(arr1[p1++]);
//        while(p2< M)
//            answer.add(arr2[p2++]);
//
//        for (Integer i : answer)
//            System.out.print(i + " ");
//    }
}
