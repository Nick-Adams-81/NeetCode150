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

    public int trap2(int[] height) {
        int left = 0;
        int right = height.length -1;
        int result = 0;
        int maxLeft = 0;
        int maxRight = 0;
        while(left <= right) {
                if(height[left] <= height[right]) {
                    if(height[left] >= maxLeft) maxLeft = height[left];
                    else result += maxLeft - height[left];
                    left++;
                } else {
                    if(height[right] >= maxRight) maxRight = height[right];
                    else result += maxRight - height[right];
                    right--;
                }
            }

        return result;
    }
}
