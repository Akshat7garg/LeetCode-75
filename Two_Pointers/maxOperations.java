class Solution {

    /**
     * This method returns the maximum number of operations you can perform
     * where each operation is picking two distinct elements from the array
     * that sum up to a given target. Each element can be used at most once.
     *
     * Example:
     * Input: nums = [1,2,3,4], target = 5
     * Output: 2 (because 1+4 and 2+3 both sum to 5)
     *
     * Time Complexity: O(n log n) due to sorting
     * Space Complexity: O(1) extra space
     */
    public int maxOperations(int[] nums, int target) {
        int start = 0;                    // Pointer at beginning of array
        int end = nums.length - 1;       // Pointer at end of array

        Arrays.sort(nums);               // Step 1: Sort the array to use two-pointer technique
        int operationCount = 0;          // To count valid operations (pairs)

        // Step 2: Use two pointers to find valid pairs
        while (start < end) {
            int sum = nums[start] + nums[end];

            if (sum < target) {
                // If sum is too small, move start forward to increase it
                start++;
            } else if (sum > target) {
                // If sum is too big, move end backward to decrease it
                end--;
            } else {
                // Found a valid pair
                start++;
                end--;
                operationCount++; // Count this operation
            }
        }

        // Step 3: Return total number of valid operations
        return operationCount;
    }
}
