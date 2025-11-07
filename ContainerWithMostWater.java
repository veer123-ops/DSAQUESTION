package veer.com;
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;
            maxArea = Math.max(maxArea, area);

            // Move the pointer of the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum water area: " + maxArea(height)); // Output: 49
    }
}
/*
Two Pointer Approach (Optimal)
Complexity Analysis
Metric	Complexity
Time Complexity	O(n) → each element visited at most once
Space Complexity	O(1) → only constant extra variables used
*/