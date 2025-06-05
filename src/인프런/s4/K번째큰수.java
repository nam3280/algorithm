package 인프런.s4;

import java.util.*;

public class K번째큰수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    set.add(sum);
                }
            }
        }

        int answer = -1;
        int count = 0;
        for (Integer i : set) {
            count++;
            if(count == K)
                answer = i;
        }

        System.out.println(answer);
    }
}
