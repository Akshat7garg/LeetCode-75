// Define the Solution class
class Solution {

    /**
     * This method finds the greatest common divisor (GCD) string of two input strings.
     * A GCD string is the largest string that can be concatenated multiple times to form both strings.
     *
     * For example, if str1 = "ABCABC" and str2 = "ABC", the GCD string is "ABC",
     * because "ABC" can be repeated to form both strings.
     */
    public String gcdOfStrings(String str1, String str2) {

        // Step 1: Check if str1 + str2 equals str2 + str1.
        // If not, there is no common GCD string possible, so return an empty string.
        // This check ensures that both strings are made of the same repeating pattern.
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Step 2: Get the lengths of both strings.
        int len1 = str1.length();
        int len2 = str2.length();

        // Step 3: Use the Euclidean algorithm to compute the GCD of the two lengths.
        // This GCD length tells us how long the repeating unit is.
        while (len2 != 0) {
            int temp = len2;
            len2 = len1 % len2;
            len1 = temp;
        }

        // Step 4: Return the substring from the beginning of str1 with length equal to the GCD.
        // This substring is the largest possible string that divides both str1 and str2.
        return str1.substring(0, len1);
    }
}
