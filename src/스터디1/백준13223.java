package 스터디1;

import java.util.*;

public class 백준13223 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String now = scanner.nextLine();
        String salt = scanner.nextLine();

        String[] nowSplit = now.split(":");
        String[] saltSplit = salt.split(":");

        int nowHour = Integer.parseInt(nowSplit[0]);
        int nowMinute = Integer.parseInt(nowSplit[1]);
        int nowSecond = Integer.parseInt(nowSplit[2]);

        int saltHour = Integer.parseInt(saltSplit[0]);
        int saltMinute = Integer.parseInt(saltSplit[1]);
        int saltSecond = Integer.parseInt(saltSplit[2]);
        
        int nowSeconds = nowHour * 3600 + nowMinute * 60 + nowSecond;
        int saltSeconds = saltHour * 3600 + saltMinute * 60 + saltSecond;
        
        int difference = saltSeconds - nowSeconds;
        if (difference < 0)
            difference += 24 * 3600;
        else if(difference == 0)
            difference = 24 * 3600;

        int hour = difference / 3600;
        int minute = (difference % 3600) / 60;
        int second = difference % 60;

        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }
}
