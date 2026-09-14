class Solution{
    public boolean isRectangleOverlap(int[] rec1,int[] rec2){
        boolean x=Math.max(rec1[0],rec2[0])<Math.min(rec1[2],rec2[2]);
        boolean y=Math.max(rec1[1],rec2[1])<Math.min(rec1[3],rec2[3]);
        return x && y;
    }
}