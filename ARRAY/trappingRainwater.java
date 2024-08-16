// given n non-negative integers representing an elevation map where the eidth of each bar is 1, computer hoe much water it can tap after raining.
public class trappingRainwater {

    public static int trappingRainwater(int height[]) {
        int n = height.length;
        // calculate left max boundary = array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 0; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // calculate right max boundary = array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedrain = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterlevel = min (leftmax bound , right bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterlevel - height[i]
            trappedrain += waterlevel - height[i];
        }
        return trappedrain;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println( trappingRainwater(height));

    }
}
