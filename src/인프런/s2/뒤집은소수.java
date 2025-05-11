package 인프런.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 뒤집은소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            StringBuilder sb = new StringBuilder();
            int reverse =  Integer.parseInt(sb.append(input[i]).reverse().toString());
            int count = 0;
            for (int j = 1; j <= reverse; j++) {
                if(reverse % j != 0)
                    count++;
            }

            if(count == reverse - 2)
                System.out.print(reverse + " ");
        }
    }
}
