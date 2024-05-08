class Solution {
    public int smallestEvenMultiple(int n) {
        int flag;
        if(n%2==0){
            flag=1;
        }
        else{
            flag=0;
        }
        if(flag==1){
            return n;
        }
        else{
            return n*2;
        }
    }
}