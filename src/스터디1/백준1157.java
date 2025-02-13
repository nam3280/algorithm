package 스터디1;

import java.util.*;

public class 백준1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        //모두 대문자로 변환
        word = word.toUpperCase();

        int[] wordAlphabet = new int[26];

        //각 알파벳의 빈도 계산
        for (char c : word.toCharArray())
            wordAlphabet[c - 'A']++;

        //가장 많이 등장한 알파벳의 빈도 구하기
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (wordAlphabet[i] > max)
                max = wordAlphabet[i];
        }

        //가장 많이 등장한 알파벳이 여러 개인지 확인
        int count = 0;
        char result = 0;
        for (int i = 0; i < 26; i++) {
            if (wordAlphabet[i] == max) {
                count++;
                result = (char)(i + 'A');
            }
        }

        //max가 여러 개가 있으면 "?" 출력, 아닐 때 result 출력
        if (count > 1)
            System.out.println("?");
        else
            System.out.println(result);
    }
}