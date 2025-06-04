package 인프런.s3;

import java.util.Scanner;

public class 최대길이연속부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");

        int idx = 0;
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("0"))
                count++;

            while(count > K){
                idx++;
                if(arr[idx].equals("0"))
                    count--;
            }

            max = Math.max(max, i - idx);
        }

        System.out.println(max);
    }
}
