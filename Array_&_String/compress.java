class Solution {

    /**
     * Compresses the input character array in-place using run-length encoding.
     * For example, ['a','a','b','b','c','c','c'] becomes ['a','2','b','2','c','3'].
     * If a character appears only once, no count is added.
     *
     * Returns the new length of the compressed array.
     */
    public int compress(char[] chars) {

        // Step 1: Initialize tracking variables
        char prevChar = chars[0];        // The character we're currently counting
        int charCount = 0;               // Number of times current character has occurred
        StringBuilder compressStr = new StringBuilder();  // To store the compressed string

        // Step 2: Iterate through the input characters
        for (char currChar : chars) {

            // Step 3: If the current character is different from the previous one
            if (prevChar != currChar) {

                // Add the previous character to the result
                compressStr.append(prevChar);

                // If it occurred more than once, append the count as well
                if (charCount > 1) {
                    compressStr.append(Integer.toString(charCount));
                }

                // Reset count for the new character
                charCount = 0;
            }

            // Step 4: Update previous character and increment count
            prevChar = currChar;
            charCount++;
        }

        // Step 5: Handle the last character group after the loop ends
        compressStr.append(prevChar);
        if (charCount > 1) {
            compressStr.append(Integer.toString(charCount));
        }

        // Step 6: Overwrite the original array with the compressed result
        int strLen = compressStr.length();
        for (int i = 0; i < strLen; i++) {
            chars[i] = compressStr.charAt(i);
        }

        // Step 7: Return the length of the compressed character array
        return strLen;
    }
}
