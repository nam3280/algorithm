package 스터디1;

import java.io.*;

public class 백준11608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] arr = new int[26];

        for (char c : word.toCharArray())
            arr[c - 'a']++;

        int complexity = 0;
        for (int i : arr) {
            if (i > 0)
                complexity++;
        }

        if (complexity <= 2)
            System.out.println(0);
        else
            System.out.println(complexity - 2);
    }
}
