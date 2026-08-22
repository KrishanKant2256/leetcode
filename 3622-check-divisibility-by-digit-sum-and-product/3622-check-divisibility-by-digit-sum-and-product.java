class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int num=n;
        while(num>0)
        {
            int d=num%10;
            sum=sum+d;
            product=product*d;
            num=num/10;
        }
        int ultimateSum=sum+product;
        return n%ultimateSum==0;
    }
}