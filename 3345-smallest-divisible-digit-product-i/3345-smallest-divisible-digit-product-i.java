class Solution {
    public int smallestNumber(int n, int t) {
        boolean flag=false;
        while(flag==false)
        {
            int mul=1;
            int temp=n;
        while(temp>0)
        {
            mul*=temp%10;
            temp/=10;
        }
        if(mul%t==0)
        {
            flag=true;
        }
        n++;
        }
        return --n;
    }
}