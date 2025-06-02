// Define the Solution class
class Solution {

    /**
     * This method determines which children can have the greatest number of candies
     * if they were given all the extraCandies.
     * 
     * For each child, we check if their candies + extraCandies is at least equal to
     * the current maximum candies among all kids.
     * 
     * We return a list of booleans where each value corresponds to whether a child
     * can reach or exceed the maximum.
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // Step 1: Find the current maximum number of candies any kid has
        int maxCandies = Integer.MIN_VALUE; // Start with the smallest possible value
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy); // Update maxCandies if we find a higher value
        }

        // Step 2: Initialize a list to store the result for each child
        List<Boolean> res = new ArrayList<>();

        // Step 3: Loop through each child's candy count
        for (int candy : candies) {
            // Check if the current child can reach or exceed the max candies
            // after getting the extraCandies
            if ((candy + extraCandies) >= maxCandies) {
                res.add(true); // Child can have the most candies
            } else {
                res.add(false); // Child cannot have the most candies
            }
        }

        // Step 4: Return the result list
        return res;
    }
}
