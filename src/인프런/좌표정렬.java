package 인프런;

import java.io.*;
import java.util.*;

public class 좌표정렬 {
    public void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Point> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] coordinate = br.readLine().split(" ");

            int coordinateX = Integer.parseInt(coordinate[0]);
            int coordinateY = Integer.parseInt(coordinate[1]);

            Point point = new Point(coordinateX, coordinateY);

            list.add(point);
        }

        Collections.sort(list);

        for (Point p : list)
            System.out.println(p.x + " " + p.y);
    }

    public static class Point implements Comparable<Point> {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x)
                return this.y - o.y; // y 오름차순
            else
                return this.x - o.x; // x 오름차순
        }
    }
}

//그냥 공식으로 외우자 -> 첫번 째 파라미터는 앞, 두번 째 파라미터는 뒤일 때
//CompareTo
//a - b : a에서 b로 정렬하는 것 (오름차순임) -> 음수
//b - a : b에서 a로 정렬하는 것 (내림차순임) -> 양수
