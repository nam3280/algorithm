package 스터디1;

import java.util.*;

public class 백준1919 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        //각 알파벳의 빈도수를 담는 배열(카운트 배열)
        int[] wordAlphabet1 = new int[26];
        int[] wordAlphabet2 = new int[26];

        //각 알파벳의 빈도수 계산
        //문자를 toCharArray()로 하나하나 쪼개서 배열에 담는다.
        for (char c : word1.toCharArray())
            wordAlphabet1[c - 'a']++;
        for (char c : word2.toCharArray())
            wordAlphabet2[c - 'a']++;

        //첫 번째 단어와 두 번째 단어의 알파벳이 다를 때 제거해야 하므로 total에 넣어준다.
        //만약 알파벳의 개수가 없거나 같다면 차가 0이 되므로 괜찮음
        //음수가 나올 수 있기 때문에 절댓값을 해준다.
        int total = 0;
        for (int i = 0; i < 26; i++) {
            total += Math.abs(wordAlphabet1[i] - wordAlphabet2[i]);
        }

        System.out.println(total);
    }
}