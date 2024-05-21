public class NextPermutations {
    public static void nextPermutation(int[] nums) {
        int N = nums.length-1;
        int i;
        int j;
        for (i = N - 1; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        if (i >= 0) {
            for (j = N; j > i; j--) {
                if (nums[i] < nums[j]) {
                    break;
                }
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, N);
    }
    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int A[], int i, int j) {
        while (i < j) {
            swap(A, i, j);
            i++;
            j--;
        }
    }

    public static void nextPermutationString(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            nextPermutationString(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        String str = "abs";
        String ans = "";
        nextPermutation(nums);
        // nextPermutationString(str, ans);

    }
}
