package TwoPointers;

public class TrappingRainWater {

    public int trap(int[] height) {
        int max = 0;
        for(int i = 0; i < height.length; i++) {
            if(height[max] < height[i]) {
                max = i;
            }
        }
        int sum = 0;
        int leftMax = 0;
        int rightMax = height.length -1;
        for(int i = 0; i < max; i++) {
            if(height[leftMax] < height[i]) {
                leftMax = i;
            }
            sum += Math.min(height[leftMax], height[max]) - height[i];
        }
        for(int i = height.length -1; i > max; i--) {
            if(height[rightMax] < height[i]) {
                rightMax = i;
            }
            sum += Math.min(height[max], height[rightMax]) - height[i];
        }
        return sum;
    }
}
