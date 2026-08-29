class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int index = 0;

        for(int i = 1; i <= arr[arr.length - 1]; i++) {
            if(index < arr.length && arr[index] == i) {
                index++;
            }
            else {
                count++;

                if(count == k) {
                    return i;
                }
            }
        }
        return arr[arr.length - 1] + (k - count);
    }
}