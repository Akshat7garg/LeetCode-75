class Solution {

    /**
     * Finds the maximum number of vowels in any substring of length 'windowSize'.
     *
     * @param str The input string
     * @param windowSize The size of the sliding window
     * @return The maximum number of vowels found in any window
     */
    public int maxVowels(String str, int windowSize) {
        int strLen = str.length();
        int maxVowelCount = 0;

        // Step 1: Count vowels in the initial window of size 'windowSize'
        for (int idx = 0; idx < windowSize; idx++) {
            if (isVowel(str.charAt(idx))) {
                maxVowelCount++;
            }
        }

        // If string length is less than or equal to window size, return the count directly
        if (strLen <= windowSize) {
            return maxVowelCount;
        }

        // Step 2: Initialize current vowel count with the initial count
        int currVowelCount = maxVowelCount;

        // Step 3: Slide the window across the string
        for (int idx = windowSize; idx < strLen; idx++) {
            // Subtract the character that moves out of the window
            if (isVowel(str.charAt(idx - windowSize))) {
                currVowelCount--;
            }

            // Add the new character that enters the window
            if (isVowel(str.charAt(idx))) {
                currVowelCount++;
            }

            // Update the maximum vowel count found so far
            maxVowelCount = Math.max(maxVowelCount, currVowelCount);
        }

        // Step 4: Return the final maximum vowel count
        return maxVowelCount;
    }

    /**
     * Helper method to check if a character is a lowercase vowel.
     *
     * @param currChar The character to check
     * @return true if the character is a vowel, false otherwise
     */
    public boolean isVowel(char currChar) {
        return currChar == 'a' || currChar == 'e' || currChar == 'i' || currChar == 'o' || currChar == 'u';
    }
}
