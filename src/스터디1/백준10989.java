package 스터디1;

import java.io.*;
import java.util.*;

public class 백준10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[num];

        StringTokenizer token = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(token.nextToken());

        int x = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int cal = x - arr[i];

            if (set.contains(cal))
                count++;

            set.add(arr[i]);
        }

        System.out.println(count);
    }
}
