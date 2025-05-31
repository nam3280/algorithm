package 백준;

import java.io.*;
import java.util.StringTokenizer;

public class 백준1008번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        StringTokenizer token = new StringTokenizer(input);

        double num1 = Integer.parseInt(token.nextToken());
        double num2 = Integer.parseInt(token.nextToken());

        bw.write(String.valueOf(num1 / num2));

        bw.flush();
        bw.close();
        br.close();
    }
}