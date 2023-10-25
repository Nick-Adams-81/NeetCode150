package TwoPointers;

public class TwoSum2 {

    public int[] twoSum2(int[] nums, int target) {
        int aPointer = 0;
        int bPointer = nums.length -1;
        while(aPointer < bPointer) {
            int diff = nums[aPointer] + nums[bPointer];
            if(diff < target) aPointer++;
            else if(diff > target) bPointer--;
            else return new int[]{aPointer + 1, bPointer + 1};
        }
        return new int[]{aPointer + 1, bPointer + 1};
    }
}
