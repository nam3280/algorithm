package 백준;

import java.io.*;

public class 백준18108번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(input - 543));

        bw.flush();
        bw.close();
        br.close();
    }
}