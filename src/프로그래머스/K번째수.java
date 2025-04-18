package 프로그래머스;

import java.util.*;

public class K번째수 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            //Arrays.copyOfRange(array, start - 1, end);
            //배열의 start - 1 째부터 end - 1 째까지 출력
            int[] temp = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(temp);
            answer[i] = temp[k - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        K번째수 obj = new K번째수();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };

        int[] result = obj.solution(array, commands);

        System.out.println(Arrays.toString(result));
    }
}
