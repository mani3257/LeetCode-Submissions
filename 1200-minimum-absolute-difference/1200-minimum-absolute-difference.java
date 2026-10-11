import java.util.*;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> ls = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        // Pass 1: Find the minimum absolute difference
        for (int i = 1; i < n; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        // Pass 2: Collect all pairs that match minDiff
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                ls.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }

        return ls;
    }
}