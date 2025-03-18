package 스터디1;

import java.io.*;
import java.util.StringTokenizer;

public class 백준3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int min = 101;
            int sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){
                int token = Integer.parseInt(st.nextToken());

                if(token % 2 == 0) {
                    sum += token;

                    if(min > token)
                        min = token;
                }
            }

            bw.flush();
            bw.write(sum + " " + min);
            bw.write("\n");
        }

        bw.close();
    }
}
