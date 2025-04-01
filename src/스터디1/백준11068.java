package 스터디1;

import java.io.*;

public class 백준11068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        char[] arr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz".toCharArray();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < T; i++) {
            boolean same = false;

            int data = Integer.parseInt(br.readLine());

            int save = data;

            for (int j = 2; j < 65; j++) {
                data = save;

                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();

                while(data > 0) {
                    sb1.insert(0, arr[data % j]);
                    sb2.append(arr[data % j]);
                    data /= j;
                }

                if(sb1.compareTo(sb2) == 0) {
                    same = true;
                    result.append(1).append("\n");
                    break;
                }
            }

            if(!same)
                result.append(0).append("\n");
        }

        System.out.println(result);
    }
}
