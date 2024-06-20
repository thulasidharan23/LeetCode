class Solution {
    public int[] minOperations(String boxes) {
        
        int []box=new int[boxes.length()-1];
        int k=0;
        for(int i=0;i<boxes.length();i++){
            for(int j=0;j<boxes.length();i++){
                int sum=0;
                if(i==j){
                    continue;
                }
                else{
                    if(boxes.charAt(j)=='1'){
                        sum+=Math.abs(i-j);
                    }
                    
                }
            }
        }
        return box;
    }
}