class Solution {

    /**
     * Simulates the collisions between asteroids moving in opposite directions.
     *
     * Asteroids are represented as integers in an array:
     * - Positive value: asteroid moving to the right.
     * - Negative value: asteroid moving to the left.
     * 
     * Collision Rules:
     * - Only asteroids moving in opposite directions can collide.
     * - The smaller one explodes; if both are equal, both explode.
     * - Asteroids moving in the same direction never collide.
     *
     * Example:
     * Input: asteroids = [5, 10, -5]
     * Output: [5, 10]
     * Explanation: -5 collides with 10 and explodes because 10 is larger.
     */
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> sequence = new ArrayList<>(); // Holds the result after collisions
        int idx = -1; // Points to the last index of the 'sequence' list

        // Iterate through each asteroid
        for (int asteroid : asteroids) {
            boolean alive = true; // Flag to determine if the current asteroid survives

            // Check for possible collisions: current asteroid is moving left (< 0)
            // and the last asteroid in sequence is moving right (> 0)
            while (idx >= 0 && asteroid < 0 && sequence.get(idx) > 0) {
                if (sequence.get(idx) < -asteroid) {
                    // Current asteroid is bigger; destroy the right-moving one
                    sequence.remove(idx);
                    idx--;
                    continue; // Check for more possible collisions
                } else if (sequence.get(idx) == -asteroid) {
                    // Equal size: both asteroids explode
                    sequence.remove(idx);
                    idx--;
                }

                // In both cases above, the current asteroid dies if it's not larger
                alive = false;
                break;
            }

            if (alive) {
                // If current asteroid survived all collisions, add it to the sequence
                idx++;
                sequence.add(asteroid);
            }
        }

        // Convert result from ArrayList to array
        int[] finalSequence = new int[idx + 1];
        for (int i = 0; i <= idx; i++) {
            finalSequence[i] = sequence.get(i);
        }

        return finalSequence;
    }
}
