class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int start = 0;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                ans[start] = nums[i];
                start++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                ans[start] = nums[i];
                start++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                ans[start] = nums[i];
                start++;
            }
        }

        return ans;
    }
}