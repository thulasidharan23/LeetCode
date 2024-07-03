class Solution {
    public int[] evenOddBit(int n) {
        int ans[]=new int[2];
        String value=Integer.toBinaryString(n);
        int a=0;
        for(int i=value.length()-1;i>=0;i--){
            if(a%2==0 && value.charAt(i)=='1'){
                ans[0]++;
            }
            else if(a%2!=0 && value.charAt(i)=='1'){
                ans[1]++;
            }
            a++;
        }
        return ans;
    }
}