// Define the Solution class
class Solution {

    /**
     * This method determines whether it is possible to plant a given number of flowers (flowerCount)
     * in a flowerbed array without violating the rule that no two flowers can be adjacent.
     * 
     * The flowerbed array contains 0 (empty) and 1 (planted). Flowers can only be planted at 0s
     * if both adjacent positions are also 0 or out of bounds.
     */
    public boolean canPlaceFlowers(int[] flowerbed, int flowerCount) {

        // Step 1: Get the length of the flowerbed
        int bedLen = flowerbed.length;

        // Step 2: Edge case - If no flowers need to be planted, return true immediately
        if (flowerCount == 0)
            return true;

        // Optional early exit (not always effective): If we need more flowers than spaces, return false
        if (flowerCount > bedLen)
            return false;

        // Step 3: Iterate through each position in the flowerbed
        for (int i = 0; i < bedLen; i++) {

            // Step 4: Check if the current plot is empty (0)
            // and both its adjacent plots are also empty or out of bounds (i.e., safe to plant)
            if ((i == 0 || flowerbed[i - 1] == 0) &&     // left plot is empty or edge
                flowerbed[i] == 0 &&                     // current plot is empty
                (i == bedLen - 1 || flowerbed[i + 1] == 0)) { // right plot is empty or edge

                // Plant a flower at the current position
                flowerbed[i] = 1;

                // Decrease the number of flowers left to plant
                flowerCount--;

                // If all flowers are planted, return true early
                if (flowerCount == 0) {
                    return true;
                }
            }
        }

        // Step 5: After traversing the whole flowerbed, if some flowers are still unplanted, return false
        return false;
    }
}
