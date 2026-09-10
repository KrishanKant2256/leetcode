class Solution{
    public String reverseByType(String s){
        char[] a=s.toCharArray();

        int left=0;
        int right=a.length-1;

        while(left<right){
            if(a[left]>='a'&&a[left]<='z' &&
               a[right]>='a'&&a[right]<='z'){

                char temp=a[left];
                a[left]=a[right];
                a[right]=temp;

                left++;
                right--;
            }
            else{
                if(a[left]<'a'||a[left]>'z')
                    left++;

                if(a[right]<'a'||a[right]>'z')
                    right--;
            }
        }

        left=0;
        right=a.length-1;

        while(left<right){
            if((a[left]<'a'||a[left]>'z') &&
               (a[right]<'a'||a[right]>'z')){

                char temp=a[left];
                a[left]=a[right];
                a[right]=temp;

                left++;
                right--;
            }
            else{
                if(a[left]>='a'&&a[left]<='z')
                    left++;

                if(a[right]>='a'&&a[right]<='z')
                    right--;
            }
        }

        return new String(a);
    }
}