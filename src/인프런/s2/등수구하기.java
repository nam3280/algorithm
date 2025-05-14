package 인프런.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 등수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr= new int[N];
        int[] rank= new int[N];

        Arrays.fill(rank,1);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int idx = 0;
        while(st.hasMoreTokens())
            arr[idx++] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j])
                    rank[i]++;
            }
        }

        for (int i = 0; i < rank.length; i++)
            System.out.print(rank[i] + " ");
    }
}
