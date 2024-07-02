class Solution {
    public boolean isSameAfterReversals(int num) {
        int n=num;
        if(n%10==0 && n!=0){
            return false;
        }
        return true;
    }
}