class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd=0,even=0;
        for(int n:position){
            if(n%2!=0){
                odd++;
            }
            else{
                even++;
            }
        }
        return Math.min(odd,even);
    }
}