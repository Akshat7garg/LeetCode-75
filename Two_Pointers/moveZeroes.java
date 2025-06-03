class Solution {

    /**
     * This method moves all zeroes in the given array to the end
     * while maintaining the relative order of the non-zero elements.
     *
     * The operation is done in-place (no extra array).
     *
     * Example:
     * Input:  [0, 1, 0, 3, 12]
     * Output: [1, 3, 12, 0, 0]
     */
    public void moveZeroes(int[] nums) {
        int len = nums.length;

        // zeroIdx keeps track of where the next non-zero element should be placed.
        int zeroIdx = 0;

        // Step 1: Traverse the array
        for (int i = 0; i < len; i++) {

            // Step 2: When a non-zero element is found
            if (nums[i] != 0) {

                // Step 3: If current index is not already the zeroIdx, move the non-zero
                // element to zeroIdx, and set current position to 0
                if (i != zeroIdx) {
                    nums[zeroIdx] = nums[i]; // Move non-zero to front
                    nums[i] = 0;             // Replace moved element with 0
                }

                // Step 4: Move zeroIdx to the next position
                zeroIdx++;
            }
        }
    }
}
