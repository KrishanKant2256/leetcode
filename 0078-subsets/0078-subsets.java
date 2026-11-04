class Solution {
    List<List<Integer>> result=new ArrayList<>();
    void subsets(int nums[],int idx,List<Integer> temp)
    {
        if(idx==nums.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        subsets(nums,idx+1,temp);

        temp.remove(temp.size()-1);
        subsets(nums,idx+1,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        int idx=0;
        subsets(nums,idx,temp);
        return result;
    }
}