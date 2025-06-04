class Solution {

    /**
     * This method finds the length of the longest subarray consisting of only 1s,
     * after deleting exactly one element (which can be a 0 or 1) from the given binary array.
     *
     * It uses the sliding window (two-pointer) technique to maintain a window
     * with at most one 0 in it. The length of such a window minus one 0 (i.e., after deletion)
     * gives the required maximum length of 1s.
     *
     * Time Complexity: O(n), where n is the length of the array.
     * Space Complexity: O(1), constant space used.
     *
     * Example:
     * Input: [1,1,0,1,1,1,0,1]
     * Output: 5 (delete a 0 between two blocks of 1s)
     */
    public int longestSubarray(int[] nums) {
        int len = nums.length;

        int left = 0;           // Left boundary of the sliding window
        int zeroCount = 0;      // Number of 0s in the current window
        int maxOnes = 0;        // Stores the maximum length of valid subarray with at most one 0

        // Use a right pointer to expand the window
        for (int right = 0; right < len; right++) {

            // Step 1: If the current element is 0, increment the zero count
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Step 2: If there are more than 1 zero in the window, shrink it from the left
            while (zeroCount > 1) {
                // If the element being removed is 0, decrease the zero count
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++; // Shrink the window from the left
            }

            // Step 3: Calculate the length of the current valid window
            // We subtract left from right because we are always "removing" one element (zero)
            maxOnes = Math.max(maxOnes, right - left);
        }

        // Step 4: Return the maximum valid length found
        return maxOnes;
    }
}
