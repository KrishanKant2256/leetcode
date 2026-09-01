class Solution{
    public int numIdenticalPairs(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        int gp=0;
        for(int x:nums){
            if(map.containsKey(x))
                gp+=map.get(x);
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return gp;
    }
}