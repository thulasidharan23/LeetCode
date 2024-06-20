class Solution {
    public int[] minOperations(String boxes) {
        
        int []box=new int[boxes.length()];
        
        for(int i=0;i<boxes.length();i++){
            int sum=0;
            a:
            for(int j=0;j<boxes.length();j++){
                if(i==j){
                    continue a;
                }
                if(boxes.charAt(j)=='1'){
                    sum+=Math.abs(i-j);
                }
            }
            box[i]=sum;
        }
        return box;
    }
}