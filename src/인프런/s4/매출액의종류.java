package 인프런.s4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class 매출액의종류 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        //map은 어떤 숫자가 몇 개 있는지 저장하는 역할
        //map에 K - 1까지 넣어준다. -> 슬라이딩 윈도우
        for (int i = 0; i < K - 1; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        int idx = 0;
        for (int i = K - 1; i < N; i++) {
            //K 넣음
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            //K개 다 map에 넣었으니까 숫자의 종류를 리스트에 담기
            //근데 이거 set으로 해도 되지 않나..?
            //set으로 가능하지만 슬라이딩 윈도우 방식으로는 불가능하므로 시간복잡도 부분에서는 좋지 않음
            list.add(map.size());
            //리스트에 담았으니까 맵에서 하나 빼줌 -> 여기서부터는 한 칸씩 옮기는 작업
            map.put(arr[idx], map.get(arr[idx]) - 1);
            //하나 뺐는데 그 숫자의 개수가 없으면 map에서 제거
            if(map.get(arr[idx]) == 0)
                map.remove(arr[idx]);
            idx++;
        }

        for (Integer i : list)
            System.out.print(i + " ");
    }
}
