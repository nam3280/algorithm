package 인프런.s4;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : input1.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        String str = "YES";
        for (Character c : input2.toCharArray()) {
            if(!map.containsKey(c) || map.get(c) == 0){
                str = "NO";
                break;
            }
        }
        System.out.println(str);

//        Scanner sc = new Scanner(System.in);
//        char[] input1 = sc.nextLine().toCharArray();
//        char[] input2 = sc.nextLine().toCharArray();
//
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        HashMap<Character, Integer> map2 = new HashMap<>();
//
//        for (int i = 0; i < input1.length; i++) {
//            map1.put(input1[i], map1.getOrDefault(input1[i], 0) + 1);
//            map2.put(input2[i], map2.getOrDefault(input2[i], 0) + 1);
//        }
//
//        String str = "YES";
//        for (Character c : map1.keySet()) {
//            if(map1.get(c) != map2.get(c)){
//                str = "NO";
//                break;
//            }
//        }
//
//        System.out.println(str);
    }
}
