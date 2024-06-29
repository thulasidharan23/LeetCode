class Solution {
    public int minPartitions(String n) {
        int max=Integer.MIN_VALUE;
        for(char ch:n.toCharArray()){
            if(ch-'0'>max){
                max=ch-'0';
            }
        }
        return max;
    }
}