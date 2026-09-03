class Solution{
    public boolean uniformArray(int[] nums1){
        int minimum=Integer.MAX_VALUE;
        boolean allEven=true;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]<minimum){
                minimum=nums1[i];
            }
            if(nums1[i]%2!=0){
                allEven=false;
            }
        }
        if(allEven){
            return true;
        }
        if(minimum%2!=0){
            return true;
        }
        return false;
    }
}