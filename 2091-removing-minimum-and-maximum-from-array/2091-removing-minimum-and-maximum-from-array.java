class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIdx]) minIdx = i;
            if (nums[i] > nums[maxIdx]) maxIdx = i;
        }

        int i = Math.min(minIdx, maxIdx);
        int j = Math.max(minIdx, maxIdx);

        int fromFront = j + 1;                 // both removed from front
        int fromBack = n - i;                  // both removed from back
        int fromBoth = (i + 1) + (n - j);       // one from front, one from back

        return Math.min(fromFront, Math.min(fromBack, fromBoth));
    }
}