package 프로그래머스;

public class 옹알이1 {
    public int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String word : babbling) {
            String temp = word;

            for (String say : arr)
                //temp = temp.replace(say, " ");
                temp = temp.replace(say, "");

            temp = temp.replace(" ", "");

            if (temp.length() == 0)
                answer++;

        }

        return answer;
    }

    public static void main(String[] args) {
        옹알이1 obj = new 옹알이1();

        String[] array = {"aya", "yee", "u", "maa", "wyeoo"};

        int result = obj.solution(array);

        System.out.println(result);
    }
}
