class Solution {

    /**
     * This method checks if two strings are "close".
     * Two strings are close if we can make them equal using two operations any number of times:
     * 1. Swap any two existing characters (i.e., reordering the string)
     * 2. Transform every occurrence of one existing character into another (as long as the target exists)
     *
     * @param word1 First input string
     * @param word2 Second input string
     * @return true if the words are close, false otherwise
     */
    public boolean closeStrings(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        // If the lengths are different, they can never be made equal
        if (len1 != len2)
            return false;

        // Arrays to store frequency of each character (assuming lowercase English letters)
        int wordFreq1[] = new int[26];
        int wordFreq2[] = new int[26];

        // Count character frequency for both strings
        for (int i = 0; i < len1; i++) {
            wordFreq1[word1.charAt(i) - 'a']++;
            wordFreq2[word2.charAt(i) - 'a']++;
        }

        // Step 1: Check if both strings use the exact same set of characters
        // If a character is present in one but not the other, return false
        for (int i = 0; i < 26; i++) {
            if ((wordFreq1[i] == 0 && wordFreq2[i] != 0) ||
                (wordFreq1[i] != 0 && wordFreq2[i] == 0)) {
                return false;
            }
        }

        // Step 2: Sort both frequency arrays to compare frequency patterns
        // We don’t care which letter has which frequency, only the multiset of frequencies matters
        Arrays.sort(wordFreq1);
        Arrays.sort(wordFreq2);

        // Compare sorted frequency arrays
        for (int i = 0; i < 26; i++) {
            if (wordFreq1[i] != wordFreq2[i]) {
                return false;
            }
        }

        // If all checks passed, the words are close
        return true;
    }
}
