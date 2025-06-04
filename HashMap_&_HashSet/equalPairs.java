class Solution {

    /**
     * This method counts how many row-column pairs in the grid are equal.
     * A row and column are considered equal if their corresponding elements match in order.
     *
     * @param grid The input square matrix
     * @return Number of equal row-column pairs
     */
    public int equalPairs(int[][] grid) {
        int gridLen = grid.length;

        // Step 1: Create a transposed version of the grid
        // This converts columns into rows, making it easier to compare rows with original rows
        int transGrid[][] = new int[gridLen][gridLen];
        for (int row = 0; row < gridLen; row++) {
            for (int col = 0; col < gridLen; col++) {
                transGrid[row][col] = grid[col][row];  // Swap row and col to transpose
            }
        }

        int pairCount = 0;

        // Step 2: Compare every row in original grid with every row in transposed grid (i.e., column of original)
        for (int[] row : grid) {
            for (int[] col : transGrid) {
                if (Arrays.equals(row, col)) {
                    pairCount++;  // Count if a row matches a column
                }
            }
        }

        // Step 3: Return total number of matching row-column pairs
        return pairCount;
    }
}
