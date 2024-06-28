class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer>q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(q.size()!=1){
            for(int i=0;i<k;i++){
                if(i==k-1){
                    q.poll();
                    break;
                }
                int temp=q.poll();
                q.add(temp);
            }
        }
        return q.poll();
    }
}