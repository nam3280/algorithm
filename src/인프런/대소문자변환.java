package 인프런;

import java.io.*;

public class 대소문자변환 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();

        for(char c : input){
            if(c >= 65 && c <= 90)
                c += 32;
            else
                c -= 32;

            System.out.print(c);
        }
    }
}