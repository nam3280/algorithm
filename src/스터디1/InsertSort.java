package 스터디1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InsertSort {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int idx = 0;
        while (st.hasMoreTokens()) {
            arr[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }

        //배열의 모든 앞 요소와 비교해야 하기 때문에 내부 반복문이 최대 N-1번 실행
        //최악 : O(N^2)
        //최선 : O(N)
        for (int i = 1; i < N; i++) {
            int key = arr[i];
            int j;
            // key(뒤에꺼)가 삽입될 위치를 찾는 부분
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > key)
                    arr[j + 1] = arr[j]; // arr[j](앞에꺼)가 key(뒤에꺼)보다 크면, arr[j](앞에꺼)를 한 칸 뒤로 이동
                else
                    break;  // key(뒤에꺼)보다 작은 값이 나오면 종료
            }

            //swap과 같은 역할
            arr[j + 1] = key;
        }

        for (int k : arr)
            System.out.print(k + " ");
    }
}
