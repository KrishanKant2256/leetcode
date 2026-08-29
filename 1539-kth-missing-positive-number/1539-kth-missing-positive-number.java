class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(k<=arr[mid]-(mid+1)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low+k;
    }
}