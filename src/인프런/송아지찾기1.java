package 인프런;

import java.io.*;
import java.util.*;

public class 송아지찾기1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int S = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());

        int L = bfs(S, E);

        System.out.println(L);
    }

    static int bfs(int S, int E){
        int[] dis = {1, -1, 5};
        int[] ch = new int[10001];
        Queue<Integer> queue = new LinkedList<>();

        ch[S] = 1; // 시작 지점 방문 처리
        queue.offer(S);

        int L = 0; // 이동 횟수

        while(!queue.isEmpty()){
            int len = queue.size();
            System.out.println("=== Level " + L + " ==="); // 현재 레벨 출력

            for (int i = 0; i < len; i++) {
                int node = queue.poll();
                System.out.println("현재 노드: " + node);

                if(node == E)
                    return L;

                for (int j = 0; j < 3; j++) {
                    int nodeX = node + dis[j];

                    if(nodeX >= 1 && nodeX <= 10000 && ch[nodeX] == 0) {
                        ch[nodeX] = 1;
                        queue.offer(nodeX);
                        System.out.println("  이동 -> " + nodeX);
                    }
                }
            }
            L++;
        }

        return 0;
    }

}
