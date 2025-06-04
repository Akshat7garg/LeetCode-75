class Solution {

    /**
     * This method finds the length of the longest contiguous subarray with at most `k` zeroes.
     * 
     * You are allowed to flip up to `k` zeros to 1s to maximize the number of consecutive 1s.
     * The approach uses the sliding window (two-pointer) technique to find the optimal window.
     *
     * Time Complexity: O(n) — each element is visited at most twice.
     * Space Complexity: O(1) — constant space usage.
     *
     * Example:
     * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
     * Output: 6 (flip two 0s at index 4 and 5 to get six 1s from index 3 to 8)
     */
    public int longestOnes(int[] nums, int k) {
        int len = nums.length;

        int left = 0;           // Left boundary of the sliding window
        int maxOnes = 0;        // Tracks the maximum length of valid subarray
        int zeroCount = 0;      // Counts the number of 0s in the current window

        // Use 'right' pointer to expand the window
        for (int right = 0; right < len; right++) {

            // Step 1: If the current element is 0, include it in the count
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Step 2: If zeroCount exceeds k, shrink the window from the left
            while (zeroCount > k) {
                // If the element being removed is 0, decrease the zeroCount
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;  // Move left boundary to maintain at most k zeroes
            }

            // Step 3: Update the maxOnes with the current valid window size
            maxOnes = Math.max(maxOnes, right - left + 1);
        }

        // Step 4: Return the length of the longest valid subarray
        return maxOnes;
    }
}
