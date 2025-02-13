package 스터디1;

import java.util.*;

public class 백준1543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String targetWord = scanner.nextLine();

        int count = 0;
        int index = 0;

        //0번째 부터 체크한다.
        while ((index = word.indexOf(targetWord, index)) != -1) {
            count++;
            index += targetWord.length();
        }

        System.out.println(count);
    }
}

//import java.util.*;
//
//public class 백준1543 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        //문자열 입력받기
//        String word = scanner.nextLine();
//        String targetWord = scanner.nextLine();
//
//        int count = 0;
//
//        //첫번 째 단어에 두번 째 단어가 포함이 되어 있다면 count를 올린 후 첫번 째 단어에서 지운다.
//        //두번 째 단어가 포함되지 않는다면 false를 출력하므로 while문에서 빠져나올 수 있다.
//        while (word.contains(targetWord)) {
//            count++;
//            word = word.replaceFirst(targetWord, "");
//        }
//
//        System.out.println(count);
//    }
//}