package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length; i++) {
           int diff = target - nums[i];
           if(map.containsKey(diff)) {
               return new int[] {map.get(diff), i};
           }
           map.put(nums[i], i);
       }
       return new int[] {};
    }

    public int[] twoSumNSquared(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }

}
