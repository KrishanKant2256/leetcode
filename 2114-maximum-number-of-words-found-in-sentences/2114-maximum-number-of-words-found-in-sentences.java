class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords=0;

        for(String sentence:sentences) {
            int count=sentence.split(" ").length;

            if(count>maxWords) {
                maxWords=count;
            }
        }

        return maxWords;
    }
}