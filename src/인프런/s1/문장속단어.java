package 인프런.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문장속단어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        StringTokenizer token = new StringTokenizer(input);

        int max = 0;
        char[] answer = new char[0]; 
        while(token.hasMoreTokens()){
            char[] tokenInput = token.nextToken().toCharArray();
            
            if(max < tokenInput.length) {
                max = tokenInput.length;
                answer = tokenInput;
            }
        }

        for (char c : answer)
            System.out.print(c);
    }
}
