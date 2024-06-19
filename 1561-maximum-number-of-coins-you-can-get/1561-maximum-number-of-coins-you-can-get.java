class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length;
        int bob=n/3;
        int sum=0;
        for(int i=bob;i<piles.length;i+=2){
            sum+=piles[i];
        }
        return sum;
    }
}