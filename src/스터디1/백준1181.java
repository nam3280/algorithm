package 스터디1;

import java.io.*;
import java.util.*;

public class 백준1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++)
            set.add(br.readLine());

        List<String> list = new ArrayList<>(set);

        //설명하기

        list.sort(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        //함수형 인터페이스 : 하나의 추상메서드를 가지고 있는 인터페이스, 람다식(() -> {}) 또는 메서드 참조(::)로 구현될 수 있다.
        //Comparator안에는 메서드가 여러개가 있다 -> default or static
        //Comparator.comparingInt((String s1, String s2) -> s1.length() - s2.length())

        //함수형 인터페이스의 매개변수 타입 == 메소드의 매개변수 타입
        //함수형 인터페이스의 매개변수 개수 == 메소드의 매개변수 개수
        //함수형 인터페이스의 반환 타입 == 메소드의 반환 타입

        //람다 함수 : 함수형 인터페이스를 간결하게 사용할 수 있고 이름이 없이 만들어져서 익명 함수라고함
        //타입추론으로 파라미터에 데이터타입이 없어도 알아서 계산해줌


        //Comparable, Comparator -> 객체를 비교할 수 있도록 만드는 인터페이스
        //Comparable : 자기 자신과 매개변수 객체를 비교하는 것 -> 오버라이딩한 메서드의 파라미터는 1개
        //Comparator : 두 매개변수 객체를 비교하는 것 -> 오버라이딩한 메서드의 파라미터는 2개
        // 본질적으로 비교한다는 것 자체는 같지만, 비교 대상이 다르다

        //1. Insertion sort => O(N^2)
        //2. Merge sort => O(NlogN)
        //3. Quick sort => pivot => O(NlogN)
        //4. Insertion sort + Merge sort => Tim sort // O(NlogN), O(NlogN) stable
        //5. Insertion sort + Quick sort => Dual pivot Quick sort // O(NlogN), O(N^2) unstable
        // 하나씩 코드 구현하고 왜 시간복잡도가 저렇게 나왔는지

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int length = Integer.compare(o1.length(), o2.length());
                if (length != 0)
                    return length; // 길이 기준 비교
                return o1.compareTo(o2); // 길이가 같으면 사전순 정렬
            }
        };


        for (String s : list)
            System.out.println(s);
    }
}