package 인프런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            char[] input = br.readLine().toCharArray();

            for (int j = 0; j < input.length / 2; j++) {
                char change = input[input.length - 1 - j];
                input[input.length - 1 - j] = input[j];
                input[j] = change;
            }

            System.out.printf("%s%n", new String(input));
        }

    }
}

//StringBuilder의 reverse() 메서드 사용하는게 더 나을듯