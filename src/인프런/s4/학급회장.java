package 인프런.s4;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);

        int max = 0;
        char answer = 0;
        for (Character c : map.keySet()) {
            if(max < map.get(c)) {
                max = map.get(c);
                answer = c;
            }
        }

        System.out.println(answer);
    }
}
