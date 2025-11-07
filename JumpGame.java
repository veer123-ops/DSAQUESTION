package veer.com;
public class JumpGame {

    public static boolean canJump(int[] nums) {
        int maxReach = 0; // The farthest index we can currently reach

        for (int i = 0; i < nums.length; i++) {
            // If current index is beyond our max reach, we can't move forward
            if (i > maxReach) {
                return false;
            }

            // Update the farthest index we can reach
            maxReach = Math.max(maxReach, i + nums[i]);

            // If we can reach or pass the last index, return true
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return true; // if loop completes successfully
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Example 1: " + canJump(nums1)); // true

        // Example 2
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("Example 2: " + canJump(nums2)); // false

        // Example 3 (edge case)
        int[] nums3 = {0};
        System.out.println("Example 3: " + canJump(nums3)); // true
    }
}
/*
Problem Summary

You are at index 0 in an array nums.
Each element nums[i] tells you the maximum number of steps you can jump forward from that index.

Return true if you can reach (or pass) the last index, otherwise false.

🔹 Example 1

Input:
nums = [2,3,1,1,4]

Explanation:

Start at index 0 → jump up to 2 steps

Jump to index 1 → from there you can jump up to 3 steps to reach the end ✅
Output: true

🔹 Example 2

Input:
nums = [3,2,1,0,4]

Explanation:

You can reach index 3, but nums[3] = 0, so you’re stuck ❌
Output: false

⚙️ Approach: Greedy (Optimal)

We’ll keep track of the farthest index we can reach while iterating.

✅ Algorithm

Initialize maxReach = 0

Loop through the array:

If current index i > maxReach, return false (you can’t reach this index)

Update maxReach = max(maxReach, i + nums[i])

If loop ends, return true (you can reach or surpass the last index)

✅ Java Code
class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false;  // can't move further
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }
}

🧠 Dry Run Example
Example:

nums = [2,3,1,1,4]

i	nums[i]	i + nums[i]	maxReach	Can Move?
0	2	2	2	✅
1	3	4	4	✅
2	1	3	4	✅
3	1	4	4	✅
4	4	8	8	✅ (Reached end)

✅ Output = true

⏱️ Complexity

Time: O(n) → one pass through array

Space: O(1) → constant extra space

🚀 Key Insight

The greedy trick is to always track how far you can go — not how far you jump right now.
As long as the current index ≤ maxReach, you can progress. */