package 스터디1;

//import java.io.*;
//import java.util.*;
//
//public class 백준1730 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//
//        char[][] arr = new char[N][N];
//        for (int i = 0; i < N; i++)
//            Arrays.fill(arr[i], '.');
//
//        char[] moveArr = br.readLine().toCharArray();
//
//        int width = 0;
//        int height = 0;
//
//        for (int i = 0; i < moveArr.length; i++) {
//            int before = i - 1;
//
//            if(before < 0)
//                before = 0;
//
//            width = safeIndex(width, N);
//            height = safeIndex(height, N);
//
//            switch (moveArr[i]) {
//                case 'R' :
//                    if(moveArr[before] != 'R')
//                        arr[height][width] = '+';
//                    else
//                        arr[height][width] = '-';
//                    width++;
//                    break;
//                case 'L' :
//                    if(moveArr[before] != 'L')
//                        arr[height][width] = '+';
//                    else
//                        arr[height][width] = '-';
//                    width--;
//                    break;
//                case 'D' :
//                    if(moveArr[before] != 'D')
//                        arr[height][width] = '+';
//                    else
//                        arr[height][width] = '|';
//                    height++;
//                    break;
//                case 'U' :
//                    if(moveArr[before] != 'U')
//                        arr[height][width] = '+';
//                    else
//                        arr[height][width] = '|';
//                    height--;
//                    break;
//                default:
//                    break;
//            }
//
//            if(i == moveArr.length - 1 && (moveArr[i] == 'R' || moveArr[i] == 'L'))
//                arr[height][width] = '-';
//            else if(i == moveArr.length - 1 && (moveArr[i] == 'D' || moveArr[i] == 'U'))
//                arr[height][width] = '|';
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++)
//                System.out.print(arr[i][j]);
//            System.out.println();
//        }
//    }
//
//    public static  int safeIndex(int number, int N){
//        if(number < 0)
//            number = 0;
//        else if(number >= N)
//            number = N - 1;
//        return number;
//    }
//}


import java.util.*;
import java.io.*;

public class 백준1730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char [][] arr = new char [N][N];

        char[] moveArr = br.readLine().toCharArray();

        int count = moveArr.length;
        int x = N - 1;
        int y = 0;

        for(int i = 0; i < N; i++)
            Arrays.fill(arr[i], '.');

        for(int i = 0; i < count; i++) {
            if(moveArr[i] == 'U' && x + 1 < N) {
                if(arr[x][y] == '-' || arr[x][y] == '+')
                    arr[x][y] = '+';
                else arr[x][y] = '|';

                x = x + 1;

                if(arr[x][y] == '-' || arr[x][y] == '+')
                    arr[x][y] = '+';
                else arr[x][y] = '|';

            }

            else if(moveArr[i] == 'D' && x - 1 >= 0) {
                if(arr[x][y] == '-' || arr[x][y] == '+')
                    arr[x][y] = '+';
                else arr[x][y] = '|';

                x = x - 1;

                if(arr[x][y] == '-' || arr[x][y] == '+')
                    arr[x][y] = '+';
                else
                    arr[x][y] = '|';
            }

            else if(moveArr[i] == 'R' && y + 1 < N) {
                if(arr[x][y] == '|' || arr[x][y] == '+')
                    arr[x][y] = '+';
                else
                    arr[x][y] = '-';

                y = y + 1;

                if(arr[x][y] == '|' || arr[x][y] == '+')
                    arr[x][y] = '+';
                else
                    arr[x][y] = '-';
            }
            else if(moveArr[i] == 'L' && y - 1 >= 0) {
                if(arr[x][y] == '|' || arr[x][y] == '+')
                    arr[x][y] = '+';
                else
                    arr[x][y] = '-';

                y = y - 1;
                if(arr[x][y] ==  '|' || arr[x][y] == '+')
                    arr[x][y] = '+';
                else
                    arr[x][y] = '-';
            }
        }

        for(int k = N - 1; k >= 0; k--) {
            for(int j = 0; j < N; j++)
                System.out.print(arr[k][j]);
            System.out.println();
        }
    }
}
