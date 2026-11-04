class Solution {
    List<List<Integer>> result = new ArrayList<>();
    void permute(int nums[],List<Integer> temp)
    {
        if(temp.size()==nums.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!temp.contains(nums[i]))
            {
                temp.add(nums[i]);
                permute(nums,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        permute(nums,temp);
        return result;
        
    }
}