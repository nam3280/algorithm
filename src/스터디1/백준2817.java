package 스터디1;

import java.io.*;
import java.util.*;

public class 백준2817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        List<Data> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++){
            String[] staff = br.readLine().split(" ");

            if(Integer.parseInt(staff[1]) >= X * 5 / 100) {
                int count = 1;

                map.put(staff[0].charAt(0), 0);

                while (count < 15) {
                    Data data = new Data(staff[0].charAt(0), Integer.parseInt(staff[1]) / count);
                    list.add(data);
                    count++;
                }
            }
        }

        list.sort((a, b) -> Integer.compare(b.score, a.score));

        for (int i = 0; i < Math.min(14, list.size()); i++) {
            Data data = list.get(i);
            char staffInitial = data.staff;

            map.put(staffInitial, map.get(staffInitial) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : map.keySet())
            sb.append(c).append(" ").append(map.get(c)).append("\n");

        System.out.println(sb);
    }

    static class Data {
        char staff;
        int score;

        Data(char staff, int score) {
            this.staff = staff;
            this.score = score;
        }
    }
}
