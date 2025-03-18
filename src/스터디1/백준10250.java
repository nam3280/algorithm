package 스터디1;

import java.io.*;
import java.util.StringTokenizer;

public class 백준10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken());//6
            int W = Integer.parseInt(st.nextToken());//12
            int customer = Integer.parseInt(st.nextToken());//10

            int apartmentNumber = 1;

            while(customer > H){
                customer -= H;
                apartmentNumber++;
            }

            apartmentNumber += customer * 100;

            bw.flush();
            bw.write(apartmentNumber + "\n");
        }

        bw.close();
    }
}
