package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKElements(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pk = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
        pk.addAll(map.entrySet());
        int[] output = new int[k];
            for(int i = 0; i < k; i++) {
                output[i] = Objects.requireNonNull(pk.poll()).getKey();
            }
        return output;
    }
}
