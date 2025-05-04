package 인프런.s1;

import java.io.*;

public class 숫자만추출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toUpperCase().replaceAll("[A-Z]", "").toCharArray();

        StringBuilder num = new StringBuilder();
        for (char c : arr)
            num.append(c);

        int answer = Integer.parseInt(num.toString());

        System.out.println(answer);
    }
}
