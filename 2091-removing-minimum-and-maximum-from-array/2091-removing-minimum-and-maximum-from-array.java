class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n; // Edge case: if 1 or 2 elements, we must remove everything

        int minIdx = 0;
        int maxIdx = 0;

        // 1. Find the indices of the minimum and maximum elements
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIdx]) {
                minIdx = i;
            }
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }

        // 2. Determine who is on the left and who is on the right
        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);

        // 3. Calculate the costs for the three strategies
        int removeFromLeftOnly = right + 1;
        int removeFromRightOnly = n - left;
        int removeFromBothSides = (left + 1) + (n - right);

        // 4. Return the minimum of the three strategies
        return Math.min(removeFromLeftOnly, Math.min(removeFromRightOnly, removeFromBothSides));
    }
}
