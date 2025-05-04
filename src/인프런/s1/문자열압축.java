package 인프런.s1;

import java.io.*;

public class 문자열압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split("");

        StringBuilder sb = new StringBuilder(arr[0]);

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(sb.substring(sb.length() - 1).equals(arr[i])) {
                count++;

                if(i == arr.length - 1)
                    sb.append(count);
            }
            else if(count == 1)
                sb.append(arr[i]);
            else {
                sb.append(count);
                sb.append(arr[i]);
                count = 1;
            }
        }

        System.out.println(sb);
    }
}
