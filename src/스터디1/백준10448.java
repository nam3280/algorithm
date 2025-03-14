package 스터디1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class 백준10448 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        int sum = 0;
        int num = 1;
        while(sum < 1000){
            sum = num * (num + 1) / 2;
            list.add(sum);
            num++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < K; i++) {
            boolean eureka = false;

            int T = Integer.parseInt(br.readLine());

            for (int k = 0; k < list.size(); k++) {
                if(eureka)
                    break;

                for (int l = 0; l < list.size(); l++) {
                    if(eureka)
                        break;

                    for (int m = 0; m < list.size(); m++) {
                        if(T == list.get(k) + list.get(l) + list.get(m)) {
                            sb.append(1 + "\n");
                            eureka = true;
                            break;
                        }
                    }
                }
            }

            if(!eureka)
                sb.append(0 + "\n");
        }

        System.out.println(sb);
    }
}
