// Define the Solution class
class Solution {

    /**
     * This method checks whether there exists an increasing triplet subsequence
     * in the given integer array, i.e., whether there are indices i < j < k such that:
     * nums[i] < nums[j] < nums[k]
     *
     * Time Complexity: O(n) — Single pass through the array.
     * Space Complexity: O(1) — Uses only two variables.
     */
    public boolean increasingTriplet(int[] nums) {

        // Step 1: Initialize two variables to track the smallest and second smallest numbers so far
        int first = Integer.MAX_VALUE;   // The smallest number seen so far
        int second = Integer.MAX_VALUE;  // The second smallest number greater than 'first'

        // Step 2: Iterate through each number in the array
        for (int num : nums) {

            // Step 3: Try to update 'first' if current number is smaller or equal
            if (num <= first) {
                first = num; // New smallest number
            }

            // Step 4: Else try to update 'second' if current number is between 'first' and 'second'
            else if (num <= second) {
                second = num; // New second smallest number
            }

            // Step 5: If current number is greater than both 'first' and 'second',
            // then we have found an increasing triplet: first < second < num
            else {
                return true;
            }
        }

        // Step 6: If loop finishes and no triplet found, return false
        return false;
    }
}
