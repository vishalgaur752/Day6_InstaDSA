import java.util.*;

public class LeadersInArray {
    public static List<Integer> leadersAnArray(int nums[]) {
        List<Integer> leaders = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = nums.length-1; i>=0; i--) {
            if(nums[i] > max) {
                leaders.add(0, nums[i]);
                max = nums[i];
            }
        }
        return leaders;
    }
    public static void main(String[] args) {
       int nums[] = {16, 17, 4, 3, 5, 2};
        System.out.println(leadersAnArray(nums));
    }
}
