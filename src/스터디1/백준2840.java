package 스터디1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 백준2840 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input1 = br.readLine().split(" ");

        int N = Integer.parseInt(input1[0]);
        int K = Integer.parseInt(input1[1]);

        char[] arr = new char[N];
        Arrays.fill(arr, '?');

        int rotate = 0;

        boolean check = false;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < K; i++) {
            String[] input2 = br.readLine().split(" ");

            int S = Integer.parseInt(input2[0]);
            char next = input2[1].charAt(0);

            rotate = (rotate - S + N) % N;

            if (rotate < 0)
                rotate += N;

            // 1. 현재 위치에 왼쪽 방향으로 룰렛이 돌아가는 만큼(S) 빼준다.
            // 더하면 오른쪽인데 예제 출력을 보니 왼쪽으로 돌아가는 듯
            // 2. 음수가 될 수 있으므로 +N을 한다.
            // 3. N보다 커질 수 있기 때문에 %N을 한다.
            // 4. 만약 글자가 바뀐 수가 매우 크고(룰렛 칸이 변하는 수 = S) 현 위치가 매우 작을 때(rotate)
            // rotate가 음수가 나올 수 있어 한 번 더 +N을 해준다.

            if(arr[rotate] != '?' && arr[rotate] != next){
                check = true;
                sb.append("!");
                break;
            }

            arr[rotate] = next;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j] && arr[i] != '?'){
                    sb.delete(0, sb.length());
                    sb.append("!");
                    check = true;
                }
            }
        }

        if(!check) {
            for (int i = 0; i < arr.length; i++)
                sb.append(arr[(rotate + i) % N]);
        }

        System.out.println(sb);
    }
}
