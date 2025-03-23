package 스터디1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 백준2840 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input1 = br.readLine().split(" ");

        int N = Integer.parseInt(input1[0]);
        int K = Integer.parseInt(input1[1]);

        char[] arr = new char[N];
        Arrays.fill(arr, '?');

        int rotate = 0;

        boolean check = false;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < K; i++) {
            String[] input2 = br.readLine().split(" ");

            int S = Integer.parseInt(input2[0]);
            char next = input2[1].charAt(0);

            rotate = (rotate - S % N + N) % N;

            if(arr[rotate] != '?' && arr[rotate] != next){
                check = true;
                sb.append("!");
                break;
            }

            arr[rotate] = next;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j] && arr[i] != '?'){
                    sb.delete(0, sb.length());
                    sb.append("!");
                    check = true;
                }
            }
        }

        if(!check) {
            for (int i = 0; i < arr.length; i++)
                sb.append(arr[(rotate + i) % N]);
        }

        System.out.println(sb);
    }
}
