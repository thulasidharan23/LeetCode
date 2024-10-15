class Solution {
    public long minimumSteps(String s) {
        long cnt=0;
        int j=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                cnt+=(i-j);
                j++;
            }
        }
        return cnt;
    }
}