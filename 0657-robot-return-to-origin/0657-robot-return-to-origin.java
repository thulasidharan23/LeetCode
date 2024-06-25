class Solution {
    public boolean judgeCircle(String moves) {
        int up=0,right=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                up++;
            }
            else if(moves.charAt(i)=='D'){
                up--;
            }
            else if(moves.charAt(i)=='L'){
                right--;
            }
            else{
                right++;
            }
            System.out.println(right+" "+up);
        }
        if(right==0 && up==0){
            return true;
        }
        return false;
    }
}