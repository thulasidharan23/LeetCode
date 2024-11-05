class Solution {
    public int minChanges(String str) {
        int cnt=0;
        int n=str.length();
        for(int i=1;i<n;i+=2){
            if(str.charAt(i)!=str.charAt(i-1)){
                cnt++;
            }
        }
        return cnt;
    }
}