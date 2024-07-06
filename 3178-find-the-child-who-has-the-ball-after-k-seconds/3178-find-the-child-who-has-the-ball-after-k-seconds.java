class Solution {
    public int numberOfChild(int n, int k) {
        int val=k/(n-1);
        int rem=k%(n-1);
        if(val%2==0){
            return rem;
        }
        return n-rem-1;
    }
}