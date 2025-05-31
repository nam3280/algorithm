package 백준;

import java.io.*;
import java.util.StringTokenizer;

public class 백준10430번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        StringTokenizer token = new StringTokenizer(input);

        int num1 = Integer.parseInt(token.nextToken());
        int num2 = Integer.parseInt(token.nextToken());
        int num3 = Integer.parseInt(token.nextToken());

        bw.write(((num1 + num2) % num3) + "\n");
        bw.write((((num1 % num3) + (num2 % num3)) % num3) + "\n");
        bw.write(((num1 * num2) % num3) + "\n");
        bw.write((((num1 % num3) * (num2 % num3)) % num3) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}