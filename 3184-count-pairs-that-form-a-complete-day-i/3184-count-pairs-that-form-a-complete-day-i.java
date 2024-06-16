class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int n=hours.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<j && (hours[i]+hours[j])%24==0)
                {
                    ans++;
                }
            }
        }
        return ans;
        
    }
}