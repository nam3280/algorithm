package 인프런.s3;

import java.util.Scanner;

public class 연속된자연수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 6;
        int idx = 1;
        int count = 0;
        for (int i = 4; i <= N; i++) {
            sum += i;
            if(sum == N)
                count++;

            while(sum >= N){
                sum -= idx++;
                if(sum == N && idx != i)
                    count++;
            }
        }

        System.out.println(count);
    }
}
