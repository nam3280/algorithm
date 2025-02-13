package 스터디1;

import java.util.*;

//시간 초과
public class 백준10158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String space = scanner.nextLine();
        String ant = scanner.nextLine();
        int time = scanner.nextInt();

        int[] spaceCoordinate = new int[2];
        int[] antCoordinate = new int[2];

        String[] spaceSplit = space.split(" ");
        String[] antSplit = ant.split(" ");

        for (int i = 0; i < 2; i++) {
            spaceCoordinate[i] = Integer.parseInt(spaceSplit[i]);
            antCoordinate[i] = Integer.parseInt(antSplit[i]);
        }

        int count = 0;
        int index = 3;

        while(time != count){
            if(spaceCoordinate[0] == antCoordinate[0] && spaceCoordinate[1] == antCoordinate[1])
                index = 2;

            else if(antCoordinate[0] == 0 && antCoordinate[1] == 0)
                index = 3;

            else if(spaceCoordinate[0] == antCoordinate[0]){
                if(index == 4)
                    index = 2;
                else
                    index = 1;
            }

            else if(spaceCoordinate[1] == antCoordinate[1]) {
                if(index == 3)
                    index = 4;
                else
                    index = 2;
            }

            else if(antCoordinate[0] == 0){
                if(index == 2)
                    index = 4;
                else
                    index = 3;
            }

            else if(antCoordinate[1] == 0){
                if(index == 4)
                    index = 3;
                else
                    index = 1;
            }

            switch(index){
                case 1:
                    antCoordinate[0] -= 1;
                    antCoordinate[1] += 1;
                    break;
                case 2:
                    antCoordinate[0] -= 1;
                    antCoordinate[1] -= 1;
                    break;
                case 3:
                    antCoordinate[0] += 1;
                    antCoordinate[1] += 1;
                    break;
                case 4:
                    antCoordinate[0] += 1;
                    antCoordinate[1] -= 1;
                    break;
                default:
                    break;
            }

            count++;
        }

        System.out.println(antCoordinate[0] + " " + antCoordinate[1]);
    }
}
