class Solution {
    public double average(int[] salary) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int num:salary) {
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        for(int num:salary){
            if(num!=min&&num!=max){
                sum+=num;
            }
        }
        return (double)sum/(salary.length-2);
    }
}