package 인프런.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가위바위보 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {

            if(A[i].equals("1") && B[i].equals("2")
            || A[i].equals("2") && B[i].equals("3")
            || A[i].equals("3") && B[i].equals("1"))
                System.out.println("B");
            else if(A[i].equals("1") && B[i].equals("3")
                || A[i].equals("2") && B[i].equals("1")
                || A[i].equals("3") && B[i].equals("2"))
                System.out.println("A");
            else
                System.out.println("D");
        }
    }
}
