package 백준;

import java.io.*;
import java.util.*;
public class 백준3052번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        Arrays.sort(arr);

        int num = -1;
        int count = 0;

        for (int j = 0; j < arr.length; j++) {
            if (num != arr[j]) {
                count++;
                num = arr[j];
            }
        }

        System.out.println(count);
    }
}