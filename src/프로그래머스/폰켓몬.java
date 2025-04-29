package 프로그래머스;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums)
            set.add(num);

        int max = nums.length / 2;

        return Math.min(set.size(), max);
    }

    public static void main(String[] args) {
        폰켓몬 p = new 폰켓몬();

        int[] nums1 = {3,1,2,3};
        int[] nums2 = {3,3,3,2,2,4};
        int[] nums3 = {3,3,3,2,2,2};

        System.out.println(p.solution(nums1));
        System.out.println(p.solution(nums2));
        System.out.println(p.solution(nums3));
    }
}
