package 스터디2;

import java.io.*;
import java.util.*;

public class 백준2668번 {
    static int[] arr;
    static boolean[] visited, inCycle;
    static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        visited = new boolean[N + 1];
        inCycle = new boolean[N + 1];

        for (int i = 1; i <= N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            if (!visited[i])
                findCycle(i, new boolean[N + 1]);
        }
        Collections.sort(result);

        System.out.println(result.size());

        for (int num : result)
            System.out.println(num);
    }

    static void findCycle(int start, boolean[] tempVisited) {
        int current = start;
        while (!tempVisited[current] && !visited[current]) {
            tempVisited[current] = true;
            visited[current] = true;
            current = arr[current];
        }

        if (tempVisited[current]) {
            int cycleStart = current;
            while (!inCycle[cycleStart]) {
                inCycle[cycleStart] = true;
                result.add(cycleStart);
                cycleStart = arr[cycleStart];
            }
        }
    }
}
