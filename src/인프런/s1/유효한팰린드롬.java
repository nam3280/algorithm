package 인프런.s1;

import java.io.*;

public class 유효한팰린드롬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toUpperCase().replaceAll("[^A-Z]","").toCharArray();

        boolean same = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if(arr[i] != arr[arr.length - 1 - i]){
                same = false;
                break;
            }
        }

        System.out.println(same ? "YES" : "NO");
    }
}
