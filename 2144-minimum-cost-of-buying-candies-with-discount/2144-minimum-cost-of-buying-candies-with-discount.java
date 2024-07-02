class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0,count=0;
        for(int i=cost.length-1;i>=0;i--){
            if(count<2){
                sum+=cost[i];
                count++;
            }
            else{
                count=0;
            }
        }
        return sum;
    }
}