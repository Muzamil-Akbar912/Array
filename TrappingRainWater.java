public class TrappingRainWater {

    public static int trappingRainWater(int heights[]) {
        int n = heights.length;

        // left-max boundary..
        int leftMax[] = new int[n];
        leftMax[0] = heights[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], heights[i]);
        }

        // right-max boundary...
        int rightMax[] = new int[n];
        rightMax[n-1] = heights[n-1];
        for(int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], heights[i]);
        }

        // Calculate the Trapped Rain Water....
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // water-level..
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater = trappedWater + (waterLevel-heights[i]);
        }
        return trappedWater;

    }
    public static void main(String[] args) {
        int heights[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Rain Water Trapped = " + trappingRainWater(heights));
    }
}
