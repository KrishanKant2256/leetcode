class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int sum1=source[0]+source[1];
        int sum2=target[0]+target[1];

        if((sum1%2)==0 && (sum2%2)==0){
            if(sum1==sum2 || source[0]-source[1] == target[0]-target[1]){
                return 1;
            } 
            else{
                return 2;
            }
        }
        else if((sum1%2) !=0 && (sum2%2) !=0){
            if(sum1==sum2 || source[0]-source[1] == target[0]-target[1]){
                return 1;
            } 
            else{
                return 2;
            }
        }
        else{
            return -1;
        }
    }
}