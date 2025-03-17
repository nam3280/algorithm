package 스터디1;

import java.io.*;

public class 백준10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[num];
        int[] countArr = new int[10001];
        int[] answerArr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            countArr[arr[i]]++;
        }

        for (int i = 1; i < countArr.length; i++)
            countArr[i] += countArr[i - 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            answerArr[countArr[arr[i]] - 1] = arr[i];
            countArr[arr[i]]--;
        }

        StringBuilder sb = new StringBuilder();
        for (int x : answerArr)
            sb.append(x).append("\n");

        System.out.print(sb);
    }
}