class Solution {

    /**
     * This method finds the maximum amount of water that can be contained
     * between two lines from the given array of heights.
     * 
     * It uses the two-pointer approach to optimize the brute-force O(n^2) solution
     * to O(n) time complexity.
     *
     * Example:
     * Input: [1,8,6,2,5,4,8,3,7]
     * Output: 49 (between lines at index 1 and 8)
     */
    public int maxArea(int[] height) {
        int start = 0;                      // Left pointer
        int end = height.length - 1;        // Right pointer
        int maxVolume = 0;                  // To store the maximum water area found

        // Loop until the two pointers meet
        while (start < end) {

            // Step 1: Determine the shorter height between the two pointers
            int minHeight = Math.min(height[start], height[end]);

            // Step 2: Calculate distance (width) between pointers
            int dist = end - start;

            // Step 3: Compute the area (volume) and update maxVolume if this is larger
            maxVolume = Math.max(maxVolume, minHeight * dist);

            // Step 4: Move the pointer pointing to the shorter line inward,
            // because moving the taller one can't increase the area
            while (start < end && height[start] <= minHeight) start++;
            while (start < end && height[end] <= minHeight) end--;
        }

        // Step 5: Return the maximum volume found
        return maxVolume;
    }
}
