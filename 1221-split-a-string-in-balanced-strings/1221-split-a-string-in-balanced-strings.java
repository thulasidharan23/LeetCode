class Solution {
    public int balancedStringSplit(String s) {
        int l=0;
        int r=0,cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                r++;
            }
            else{
                l++;
            }
            if(r==l){
                cnt++;
            }
        }
        return cnt;
    }
}