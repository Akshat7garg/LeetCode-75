class Solution {

    /**
     * This method returns the pivot index of the array.
     * The pivot index is the index where the sum of all elements
     * strictly to the left is equal to the sum of all elements
     * strictly to the right.
     *
     * If no such index exists, return -1.
     *
     * Example:
     * Input: nums = [1, 7, 3, 6, 5, 6]
     * Output: 3
     * Explanation: Left sum = 1 + 7 + 3 = 11, Right sum = 5 + 6 = 11
     */
    public int pivotIndex(int[] nums) {
        int leftSum = 0;               // Sum of elements to the left of the current index
        int rightSum = 0;              // Total sum of the array (initially includes everything)
        int numsLen = nums.length;     // Length of the input array

        // Step 1: Calculate total sum of the array to initialize rightSum
        for (int num : nums) {
            rightSum += num;
        }

        // Step 2: Iterate through the array to check for pivot index
        for (int i = 0; i < numsLen; i++) {
            rightSum -= nums[i];       // Remove current element from right sum (since it's not part of right)

            if (leftSum == rightSum) {
                return i;              // Found the pivot index where left and right sums are equal
            }

            leftSum += nums[i];        // Add current element to left sum for next iteration
        }

        // Step 3: If no pivot index found, return -1
        return -1;
    }
}
