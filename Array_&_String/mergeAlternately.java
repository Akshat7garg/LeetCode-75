// Define a class named 'Solution'
class Solution {

    /**
     * This method takes two strings, word1 and word2, and merges them alternately.
     * For example, if word1 = "abc" and word2 = "xyz", the result will be "axbycz".
     * 
     * If the strings are of unequal length, the remaining characters from the
     * longer string are added at the end.
     */
    public String mergeAlternately(String word1, String word2) {

        // Step 1: Get the lengths of both input strings
        int len1 = word1.length();
        int len2 = word2.length();

        // Step 2: Determine the minimum length between the two strings
        // This will be used to know how many characters can be alternately merged
        int minLen = Math.min(len1, len2);

        // Step 3: Create a StringBuilder to efficiently construct the final merged
        // string
        StringBuilder res = new StringBuilder();

        // Step 4: Loop through both strings up to the minimum length and append one
        // character from each string alternately
        for (int i = 0; i < minLen; i++) {
            res.append(word1.charAt(i)); // Append i-th character from word1
            res.append(word2.charAt(i)); // Append i-th character from word2
        }

        // Step 5: If word1 is longer, append the remaining characters from word1
        if (len1 > minLen) {
            res.append(word1.substring(minLen)); // Add leftover characters from word1
        }
        // Step 6: If word2 is longer, append the remaining characters from word2
        else {
            res.append(word2.substring(minLen)); // Add leftover characters from word2
        }

        // Step 7: Convert the StringBuilder to a string and return the final result
        return res.toString();
    }
}
