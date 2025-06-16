class Solution {

    /**
     * This method removes characters in a string based on '*' operations.
     * 
     * For every '*' character, it removes the character immediately before it.
     * It simulates a stack-like behavior using a character array and an index pointer.
     *
     * Time Complexity: O(n), where n is the length of the input string.
     * Space Complexity: O(n), for the character array used for in-place operations.
     *
     * Example:
     * Input: "leet**cod*e"
     * Output: "lecoe"
     */
    public String removeStars(String s) {
        // Convert the input string to a character array for in-place manipulation
        char[] charArr = s.toCharArray();
        int idx = 0;              // Acts like a stack pointer — where to insert next

        // Traverse through the characters of the input string
        for (char currChar : charArr) {
            // If we encounter '*', simulate a "pop" by decreasing the insert pointer
            if (currChar == '*') {
                idx--;
            } else {
                // If it's a regular character, place it at idx and move idx forward
                if (charArr[idx] != currChar) {
                    charArr[idx] = currChar;
                }
                idx++;
            }
        }

        // Return the final processed string built from the first idx characters
        return new String(charArr, 0, idx);
    }
}
