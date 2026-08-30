class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;
        for(int freq:map.values())
        {
            max=Math.max(max,freq);
        }
        int ans=0;
        for(int freq:map.values())
        {
            if(freq==max)
            {
                ans+=max;
            }
        }
        return ans;
    }
}