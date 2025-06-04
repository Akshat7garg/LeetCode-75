class Solution {

    /**
     * This method checks whether the number of occurrences of each element in the array is unique.
     *
     * @param arr An array of integers
     * @return true if the frequency of every element is unique, false otherwise
     */
    public boolean uniqueOccurrences(int[] arr) {
        // Map to store the frequency (occurrences) of each integer
        HashMap<Integer, Integer> occMap = new HashMap<>();

        // Set to keep track of already seen frequencies
        HashSet<Integer> prevOccSet = new HashSet<>();

        // Step 1: Count the frequency of each element in the array
        for (int num : arr) {
            // If num is not in the map, getOrDefault returns 0, then add 1
            occMap.put(num, occMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check if all frequencies are unique
        for (int key : occMap.keySet()) {
            int currOcc = occMap.get(key);  // Frequency of the current number

            // If the frequency has already been seen, it's not unique
            if (prevOccSet.contains(currOcc)) {
                return false;
            } else {
                prevOccSet.add(currOcc);  // Mark this frequency as seen
            }
        }

        // Step 3: All frequencies are unique
        return true;
    }
}
