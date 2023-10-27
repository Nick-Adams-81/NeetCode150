package TwoPointers;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int max = 0;
        int aPointer = 0;
        int bPointer = height.length -1;
        while(aPointer < bPointer) {
            if(height[aPointer] < height[bPointer]) {
                max = Math.max(max, height[aPointer] * (bPointer - aPointer));
                aPointer++;
            } else {
                max = Math.max(max, height[bPointer] * (bPointer - aPointer));
                bPointer--;
            }
        }
        return max;
    }
}
