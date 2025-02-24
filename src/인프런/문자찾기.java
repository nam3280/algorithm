package 인프런;

import java.io.*;

public class 문자찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase();
        char[] arr = input.toCharArray();
        char input2 = br.readLine().toLowerCase().charAt(0);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input2)
                count++;
        }
        System.out.print(count);
    }
}