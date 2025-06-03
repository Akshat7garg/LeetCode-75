class Solution {

    /**
     * This method calculates the highest altitude reached during a bike ride.
     * The `gain` array represents the net gain or loss in altitude between points.
     * The starting altitude is 0.
     *
     * The goal is to find the maximum altitude reached at any point during the ride.
     *
     * Example:
     * Input: gain = [-5, 1, 5, 0, -7]
     * Altitudes: [0, -5, -4, 1, 1, -6]
     * Output: 1 (highest altitude reached)
     */
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;  // Starting altitude is 0, and we track the maximum reached
        int netGain = 0;      // Tracks current altitude after applying each gain

        // Iterate through each net gain/loss
        for (int currGain : gain) {
            netGain += currGain;  // Update the current altitude
            maxAltitude = Math.max(maxAltitude, netGain);  // Update the maximum if current is higher
        }

        // Return the highest altitude encountered
        return maxAltitude;
    }
}
