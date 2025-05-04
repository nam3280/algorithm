package 인프런.s1;

import java.io.*;

public class 중복문자제거 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (sb.toString().indexOf(str.charAt(i)) == -1)
                sb.append(str.charAt(i));
        }

        System.out.println(sb);
    }
}
