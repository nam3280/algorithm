package 인프런.s3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 공통원소구하기 {
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

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> list = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while(p1 < N && p2 < M){
            if(arr1[p1] == arr2[p2])
                list.add(arr1[p1++]);
            else if(arr1[p1] < arr2[p2])
                p1++;
            else
                p2++;
        }

        for (Integer i : list)
            System.out.print(i + " ");
    }
}
