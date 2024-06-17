class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int totalwater=0;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=h[0];
        for(int i=1;i<h.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],h[i]);
        }
        rightmax[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],h[i]);
        }
        for(int i=0;i<h.length;i++){
            int smallBlock=Math.min(leftmax[i],rightmax[i]);
            totalwater+=smallBlock-h[i];
        }
        return totalwater;
    }
}