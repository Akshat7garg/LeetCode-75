class Solution {

    /**
     * This method checks whether string `s` is a subsequence of string `t`.
     * A string `s` is a subsequence of `t` if all characters of `s` appear in `t`
     * in the same order (not necessarily contiguously).
     *
     * Example:
     * isSubsequence("abc", "ahbgdc") → true
     * isSubsequence("axc", "ahbgdc") → false
     *
     * Time Complexity: O(n), where n = length of `t`
     * Space Complexity: O(1)
     */
    public boolean isSubsequence(String s, String t) {

        // Initialize pointers for both strings
        int sIdx = 0; // Pointer for string s
        int tIdx = 0; // Pointer for string t

        int sLen = s.length(); // Length of s
        int tLen = t.length(); // Length of t

        // Step 1: Traverse both strings
        while (sIdx < sLen && tIdx < tLen) {

            // Step 2: If characters match, move the pointer in s
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++; // Move s pointer forward
            }

            // Step 3: Always move the pointer in t
            tIdx++;
        }

        // Step 4: If we have matched all characters of s, it is a subsequence
        return (sIdx == sLen);
    }
}
