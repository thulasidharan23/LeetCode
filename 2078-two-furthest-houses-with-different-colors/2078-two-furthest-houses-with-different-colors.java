class Solution {
    public int maxDistance(int[] c) {
        int ans=0,res=0;
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]!=c[j]){
                    ans=Math.abs(i-j);
                }
            }
            res=Math.max(ans,res);
        }
        return res;
    }
}