class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums) {
            set.add(num);
        }
        int max=0;
        for(int n:set)
        {
            if(!set.contains(n-1))
            {
                int i=n;
                int curr=0;
                while(set.contains(i))
                {
                    curr++;
                    i++;
                }
                max=Math.max(curr,max);
            }
        }
        return max;
    }
}