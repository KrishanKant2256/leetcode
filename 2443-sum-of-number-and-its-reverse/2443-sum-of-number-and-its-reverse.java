class Solution{
    public boolean sumOfNumberAndReverse(int num){
        for(int i=0;i<=num;i++){
            int n=i;
            int rev=0;

            while(n>0){
                rev=rev*10+n%10;
                n/=10;

                if(rev>num)
                    break;
            }

            if(i+rev==num)
                return true;
        }

        return false;
    }
}