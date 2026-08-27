class Solution {
    public void rotate(int[] nums, int k) {
        int arr[] = new int[nums.length];

        k = k % nums.length;
        for(int i = 0; i < nums.length; i++) {
            if(i + k > nums.length - 1) {
                arr[i + k - nums.length] = nums[i];
            }
            else {
                arr[i + k] = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }
}