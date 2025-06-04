class Solution {

    /**
     * This method finds the distinct integers in each array that are not present in the other.
     *
     * @param nums1 First integer array
     * @param nums2 Second integer array
     * @return A list containing two lists:
     *         - The first list has elements in nums1 but not in nums2
     *         - The second list has elements in nums2 but not in nums1
     */
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Use sets to store unique elements from each array
        Set<Integer> setNums1 = new HashSet<>();
        Set<Integer> setNums2 = new HashSet<>();

        // Add elements of nums1 to setNums1
        for (int num : nums1) setNums1.add(num);

        // Add elements of nums2 to setNums2
        for (int num : nums2) setNums2.add(num);

        // These lists will store elements unique to each set
        List<Integer> diffNums1 = new ArrayList<>();
        List<Integer> diffNums2 = new ArrayList<>();

        // Find elements in setNums1 that are not in setNums2
        for (int num : setNums1) {
            if (!setNums2.contains(num)) {
                diffNums1.add(num);  // Unique to nums1
            }
        }

        // Find elements in setNums2 that are not in setNums1
        for (int num : setNums2) {
            if (!setNums1.contains(num)) {
                diffNums2.add(num);  // Unique to nums2
            }
        }

        // Return a list containing both difference lists
        return Arrays.asList(diffNums1, diffNums2);
    }
}
