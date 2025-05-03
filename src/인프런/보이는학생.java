package 인프런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 보이는학생 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");

        int max = 0;
        int count = 0;
        for(String s : str) {
            if (Integer.parseInt(s) > max) {
                count++;
                max = Integer.parseInt(s);
            }
        }

        System.out.println(count);
    }
}
