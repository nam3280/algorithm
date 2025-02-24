package 스터디1;

import java.util.Scanner;

public class 백준1236 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] tower = new int[2];

        String[] towerCoordinate = input.split(" ");
        for (int i = 0; i < tower.length; i++)
            tower[i] = Integer.parseInt(towerCoordinate[i]);

        String[] arrangement = new String[tower[0]];

        for (int i = 0; i < arrangement.length; i++)
            arrangement[i] = scanner.nextLine();

        boolean[] widthGuard = new boolean[tower[0]];
        boolean[] heightGuard = new boolean[tower[1]];

        for (int i = 0; i < tower[0]; i++) {
            for (int j = 0; j < tower[1]; j++) {
                if (arrangement[i].charAt(j) == 'X') {
                    widthGuard[i] = true;
                    heightGuard[j] = true;
                }
            }
        }

        int missWidth = 0;
        int missheight = 0;

        for (int i = 0; i < tower[0]; i++) {
            if (!widthGuard[i])
                missWidth++;
        }

        for (int j = 0; j < tower[1]; j++) {
            if (!heightGuard[j])
                missheight++;
        }

        System.out.println(Math.max(missWidth, missheight));
    }
}

//import java.util.Scanner;
//
//public class 백준1236 {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        String input = scanner.nextLine();
//
//        int[] tower = new int[2];
//
//        String[] towerCoordinate = input.split(" ");
//
//        for (int i = 0; i < tower.length; i++)
//            tower[i] = Integer.parseInt(towerCoordinate[i]);
//
//        String[] arrangement = new String[tower[0]];
//
//        for (int i = 0; i < arrangement.length; i++)
//            arrangement[i] = scanner.nextLine();
//
//        int count = 0;
//        for (int i = arrangement.length - 1; i >= 0; i--){
//            if(!arrangement[i].contains("X"))
//                count++;
//        }
//
//        System.out.println(count);
//    }
//}