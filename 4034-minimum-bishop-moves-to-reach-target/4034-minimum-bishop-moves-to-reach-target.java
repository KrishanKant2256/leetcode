class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int r1=source[0],c1=source[1];
        int r2=target[0],c2=target[1];
        if(r1==r2&&c1==c2){
            return 0;
        }
        if((r1+c1)%2!=(r2+c2)%2){
            return -1;
        }if(Math.abs(r1-r2)==Math.abs(c1-c2)){
            return 1;
        }
        return 2;
        
    }
}