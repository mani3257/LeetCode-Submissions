class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int totalNumbers = n * n;
        
        // Frequency array to count occurrences of numbers from 1 to n^2
        int[] count = new int[totalNumbers + 1];
        
        // 1. Populate the frequency array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }
        
        int repeated = -1;
        int missing = -1;
        
        // 2. Identify the answers
        for (int i = 1; i <= totalNumbers; i++) {
            if (count[i] == 2) {
                repeated = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }
        
        return new int[]{repeated, missing};
    }
}
