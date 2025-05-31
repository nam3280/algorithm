package 백준;

import java.io.*;

public class 백준2588번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        String num2 = br.readLine();

        String[] num = num2.split("");

        for (int i = num.length - 1; i >= 0; i--)
            bw.write(num1 * Integer.parseInt(num[i]) + "\n");

        bw.write(String.valueOf(num1 * Integer.parseInt(num2)));

        bw.flush();
        bw.close();
        br.close();
    }
}