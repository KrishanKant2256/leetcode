class Solution{
    public int[] twoSum(int[] numbers,int target){
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int n=numbers[left]+numbers[right];
            if(n==target){
                return new int[]{left+1,right+1};
            }
            if(n<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
}
