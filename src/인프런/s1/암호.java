package 인프런.s1;

import java.io.*;

public class 암호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input1 = Integer.parseInt(br.readLine());
        String input2 = br.readLine();

        for (int i = 0; i < input1; i++) {
            //0부터 6까지 가져온다.
            String temp = input2.substring(0,7).replace('#', '1').replace('*', '0');

            //2진수로 계산
            int num = Integer.parseInt(temp,2);

            System.out.print((char)num);

            //0부터 6까지 문자열을 제외한 나머지 문자열을 input2에 담는다.
            input2 = input2.substring(7);
        }
    }
}
