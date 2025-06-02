// Define the Solution class
class Solution {

    /**
     * This method reverses the order of words in a given string,
     * while ignoring extra spaces between words.
     * 
     * Example:
     * Input:  "  the sky   is  blue  "
     * Output: "blue is sky the"
     */
    public String reverseWords(String str) {

        // Step 1: Split the input string by spaces
        // This creates an array where multiple spaces become empty strings ("")
        String strArr[] = str.split(" ");

        // Step 2: Get the length of the array
        int len = strArr.length;

        // Step 3: Initialize a StringBuilder to build the reversed sentence
        StringBuilder res = new StringBuilder();

        // Step 4: Iterate through the array in reverse order
        for (int i = len - 1; i >= 0; i--) {

            // Step 5: Skip any empty strings (caused by extra spaces)
            if (!strArr[i].equals("")) {

                // Step 6: Append the word followed by a space
                res.append(strArr[i] + " ");
            }
        }

        // Step 7: Remove the trailing space using substring (instead of trim)
        // Since every appended word added a space, we manually remove the last space.
        return res.substring(0, res.length() - 1);
    }
}
