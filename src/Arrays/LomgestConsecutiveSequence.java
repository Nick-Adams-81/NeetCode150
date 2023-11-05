package Arrays;

import java.util.HashSet;

public class LomgestConsecutiveSequence {

    public int longestBruteForce(int[] nums) {
        int maxLength = 0;
        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int currentLength = 1;
            while(numberExists(nums, current + 1)) {
                current++;
                currentLength++;
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }

    private boolean numberExists(int[] arr, int num) {
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }

    public int longest(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int currentLength = 1;
            if(!set.contains(current -1)) {
                while(set.contains(current + 1)) {
                    current++;
                    currentLength++;
                }
            }
            max = Math.max(max, currentLength);
        }
        return max;
    }
}
