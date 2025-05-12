package 인프런.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 점수계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");

        int point = Integer.parseInt(arr[0]);

        int gap = 0;

        for (int i = 1; i < N; i++) {
            if(arr[i].equals("1") && arr[i].equals(arr[i - 1]))
                gap++;
            else
                gap = 0;

            point += gap + Integer.parseInt(arr[i]);
        }

        System.out.println(point);
    }
}
