// Define the Solution class
class Solution {

    /**
     * This method returns an array where each element is the product of all elements in the input
     * array except the one at the current index.
     * 
     * It achieves this without using division and in O(n) time complexity.
     * 
     * Example:
     * Input:  [1, 2, 3, 4]
     * Output: [24, 12, 8, 6]
     */
    public int[] productExceptSelf(int[] nums) {

        // Step 1: Get the length of the input array
        int len = nums.length;

        // Step 2: Create an output array to hold the result
        int resArr[] = new int[len];

        // Step 3: Initialize a variable to store product of all elements to the left of the current index
        int prev = 1;

        // Step 4: Traverse the array from left to right
        // Store the product of all elements before the current index in resArr[i]
        for (int i = 0; i < len; i++) {
            resArr[i] = prev;       // Initially 1, then progressively includes product of nums[0]...nums[i-1]
            prev *= nums[i];        // Update 'prev' to include the current number for the next index
        }

        // Step 5: Reset 'prev' to 1 to calculate product of elements to the right of each index
        prev = 1;

        // Step 6: Traverse the array from right to left
        // Multiply each resArr[i] by the product of elements to the right of i
        for (int i = len - 1; i >= 0; i--) {
            resArr[i] *= prev;      // Multiply with right-side product
            prev *= nums[i];        // Update 'prev' with the current element for the next iteration
        }

        // Step 7: Return the result array
        return resArr;
    }
}
