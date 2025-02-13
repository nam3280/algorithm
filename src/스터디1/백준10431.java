package 스터디1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        int[] arr = new int[20];

        String answer = "";
        StringBuilder sb = new StringBuilder(answer);

        for (int i = 0; i < test; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine(), " ");
            token.nextToken();
            for (int j = 0; j < arr.length; j++)
                arr[j] = Integer.parseInt(token.nextToken());

            int count = 0;
            boolean button = true;
            while(button){
                int end = 0;
                for (int k = 1; k < arr.length; k++) {
                    if(arr[k] < arr[k - 1]){
                        int temp = arr[k];
                        arr[k] = arr[k - 1];
                        arr[k - 1] = temp;
                        count++;
                        end++;
                    }
                }
                if(end == 0) {
                    button = false;
                    sb.append(i + 1).append(" ").append(count).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
