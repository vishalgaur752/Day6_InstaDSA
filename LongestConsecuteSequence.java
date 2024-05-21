import java.util.*;

public class LongestConsecuteSequence {
    public static int consecutiveSequence(int nums[]) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int maxLen = 1;
        int prev = nums[0];
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (prev == nums[i]) {
                continue;
            }
            if (nums[i] == (prev + 1)) {
                len++;
                prev = nums[i];
            } else {
                len = 1;
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int nums[] = { 100, 4, 200, 1, 3, 2 };
        System.out.println(consecutiveSequence(nums));
        ;
    }
}
