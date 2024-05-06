class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int cnt=0;
        for(String a:patterns){
            if(word.contains(a)){
                cnt++;
            }
        }
        return cnt;
    }
}