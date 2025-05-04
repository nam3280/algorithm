package 인프런.s1;

import java.io.*;

public class 가장짧은문자거리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] st = br.readLine().split(" ");

        char[] arr = st[0].toCharArray();

        int[] answer = new int[arr.length];

        int count = 1000;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != st[1].charAt(0))
                answer[i] = ++count;
            else {
                count = 0;
                answer[i] = count;
            }
        }

        count = 1000;
        for (int i = answer.length - 1; i >= 0; i--) {
            if(arr[i] != st[1].charAt(0))
                count++;
            else
                count = 0;

            answer[i] = Math.min(answer[i], count);
        }

        for (int i : answer)
            System.out.print(i + " ");
    }
}
