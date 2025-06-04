class Solution {

    /**
     * Finds the maximum average of any subarray with length equal to windowSize.
     * 
     * @param nums The input array of integers
     * @param windowSize The fixed size of the sliding window
     * @return The maximum average as a double
     */
    public double findMaxAverage(int[] nums, int windowSize) {
        int len = nums.length;

        // Step 1: Calculate the sum of the first 'windowSize' elements
        int maxSum = 0;
        for (int idx = 0; idx < windowSize; idx++) {
            maxSum += nums[idx];
        }

        // If the array length is less than or equal to window size, return average directly
        if (len <= windowSize) {
            return (double) maxSum / windowSize;
        }

        // Step 2: Use sliding window to compute sum of subsequent windows and track the max sum
        int currSum = maxSum;

        // Slide the window from index 'windowSize' to the end
        for (int idx = windowSize; idx < len; idx++) {
            // Remove the element that's sliding out and add the new one
            currSum = currSum - nums[idx - windowSize] + nums[idx];
            // Update maxSum if a larger sum is found
            maxSum = Math.max(maxSum, currSum);
        }

        // Step 3: Return the maximum average found
        return (double) maxSum / windowSize;
    }
}
