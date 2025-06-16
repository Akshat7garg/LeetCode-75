class RecentCounter {

    /**
     * This class tracks the number of requests received within the last 3000 milliseconds.
     * 
     * Each call to ping(t) records a new request at time t and returns the number
     * of requests that have happened in the inclusive range [t - 3000, t].
     *
     * Example:
     * Input: ping(1), ping(100), ping(3001), ping(3002)
     * Output: 1, 2, 3, 3
     * 
     * Uses:
     * - Sliding window technique
     * - Optimized using a moving start index to avoid re-checking old elements
     */

    ArrayList<Integer> numStore; // Stores all ping timestamps
    int startIdx;                // Index of the first valid ping in the 3000ms window
    int storeSize;               // Total number of pings stored

    // Constructor: Initializes the internal data structures
    public RecentCounter() {
        numStore = new ArrayList<>();
        startIdx = 0;
        storeSize = 0;
    }
    
    /**
     * Records a new ping at time t and returns the number of pings in the range [t - 3000, t].
     *
     * @param t The time at which the ping occurs
     * @return  The number of pings in the last 3000 milliseconds
     */
    public int ping(int t) {
        numStore.add(t); // Store the current ping
        storeSize++;     // Increase the count of stored pings
        
        int minStart = Math.max(0, t - 3000); // Lower bound of valid time window

        // Move startIdx forward until we reach a ping within the valid window
        while (startIdx < storeSize) {
            if (numStore.get(startIdx) >= minStart) break;
            else startIdx++;
        }

        // Return the count of pings in the valid time window
        return storeSize - startIdx;
    }
}
