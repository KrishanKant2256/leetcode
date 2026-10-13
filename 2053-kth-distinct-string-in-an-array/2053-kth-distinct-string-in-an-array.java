class Solution {
    public String kthDistinct(String[] arr, int k) {
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(j!=i && arr[i].equals(arr[j]))
                {
                    count++;
                }
            }
            if(count==0)
            {
                k-=1;
            }
            if(k==0)
            {
                return arr[i];
            }
        }
        return "";
    }
}