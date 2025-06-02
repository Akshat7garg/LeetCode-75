// Define the Solution class
class Solution {

    /**
     * This method reverses only the vowels in the input string.
     * Non-vowel characters remain in their original positions.
     * For example: "hello" -> "holle", "leetcode" -> "leotcede"
     */
    public String reverseVowels(String str) {

        // Step 1: Initialize two pointers at the beginning and end of the string
        int start = 0;
        int end = str.length() - 1;

        // Step 2: Convert the string to a mutable StringBuilder to allow in-place updates
        StringBuilder res = new StringBuilder(str);

        // Step 3: Use the two-pointer approach to find vowels from both ends and swap them
        while (start < end) {

            // Move the 'start' pointer forward until it points to a vowel
            while (start < end && !isVowel(res.charAt(start))) {
                start++;
            }

            // Move the 'end' pointer backward until it points to a vowel
            while (start < end && !isVowel(res.charAt(end))) {
                end--;
            }

            // Step 4: Swap the vowels at the 'start' and 'end' positions
            char tempChar = res.charAt(start);
            res.setCharAt(start, res.charAt(end));
            res.setCharAt(end, tempChar);

            // Move both pointers toward the center
            start++;
            end--;
        }

        // Step 5: Return the final string with vowels reversed
        return res.toString();
    }

    /**
     * Helper method to check if a character is a vowel.
     * This method handles both lowercase and uppercase vowels.
     */
    public boolean isVowel(char currChar) {
        return currChar == 'a' || currChar == 'e' || currChar == 'i' || currChar == 'o' || currChar == 'u' ||
               currChar == 'A' || currChar == 'E' || currChar == 'I' || currChar == 'O' || currChar == 'U';
    }
}
