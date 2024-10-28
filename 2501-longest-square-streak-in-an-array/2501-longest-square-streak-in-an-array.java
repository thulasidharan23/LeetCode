class Solution {
    public int longestSquareStreak(int[] nums) {
        int max=100000;
        boolean[] present=new boolean[max+1];
        boolean[] visited=new boolean[max+1];
        for(int num:nums){
            present[num]=true;
        }
        int cnt=0;
        for(int i=2;i*i<=max;i++){
            if(!present[i] || visited[i]){
                continue;
            }
            visited[i]=true;
            int count=1;
            int next=i*i;
            while(next>=0 && next<=max && present[next]){
                visited[next]=true;
                count++;
                next*=next;
            }
            if(count>1){
                cnt=Math.max(cnt,count);
            }
        }
        if(cnt==0){
            return -1;
        }
        return cnt;
    }
}