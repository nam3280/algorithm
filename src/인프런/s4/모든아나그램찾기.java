package 인프런.s4;

import java.util.HashMap;
import java.util.Scanner;

public class 모든아나그램찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.nextLine().toCharArray();
        char[] T = sc.nextLine().toCharArray();

        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < T.length; i++)
            tMap.put(T[i], tMap.getOrDefault(T[i], 0) + 1);

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < T.length - 1; i++)
            map.put(S[i], map.getOrDefault(S[i], 0) + 1);

        int idx = 0;
        int answer = 0;
        for (int i = T.length - 1; i < S.length; i++) {
            map.put(S[i], map.getOrDefault(S[i], 0) + 1);
            if(tMap.equals(map))
                answer++;
            map.put(S[idx], map.get(S[idx]) - 1);
            if(map.get(S[idx]) == 0)
                map.remove(S[idx]);
            idx++;
        }

        System.out.println(answer);
    }
}
