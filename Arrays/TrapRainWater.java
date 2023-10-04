package Arrays;

// using arrays this solves the problem in the most optimized way possible
public class TrapRainWater {
    public static int TrappedWater(int height[]) {
        int n = height.length;
        int waterVolume = 0;
        // leftMax array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        // rightMax array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // water level = minimum of leftMax and rightMax
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // water trapped = water level - height[i]
            int TrappedWater = waterLevel - height[i];
            waterVolume += TrappedWater;
        }
        return waterVolume;

    }

    public static void main(String args[]) {
        int height[] = { 0, 1, 0, 2, 1, 0, 3 };
        System.out.println("Trapped water volume :" + TrappedWater(height));
    }
}
