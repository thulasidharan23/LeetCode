class Solution {
    public int passThePillow(int n, int time) {
        if(time>n){
            return n-2;
        }
        else{
            return n;
        }
    }
}