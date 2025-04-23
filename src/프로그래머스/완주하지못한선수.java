package 프로그래머스;

import java.util.*;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : participant)
            map.put(s, map.getOrDefault(s, 0) + 1);

        for (String t : completion)
            map.put(t, map.get(t) - 1);

        for (String key : map.keySet()) {
            if (map.get(key) != 0)
                answer = key;
        }

        return answer;
    }


    public static void main(String[] args) {
        완주하지못한선수 obj = new 완주하지못한선수();

        String answer = obj.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});

        System.out.println(answer);
    }
}
