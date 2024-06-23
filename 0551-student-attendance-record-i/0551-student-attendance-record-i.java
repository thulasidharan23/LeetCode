class Solution {
    public boolean checkRecord(String s) {
        int abs=0,present=0,late=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='A'){
                abs++;
            }
            else if(ch[i]=='L'){
                late++;
            }
            else{
                present++;
            }
        }
        System.out.println(late+" "+abs);
        
        if(late<=2 && abs<2){
            return true;
        }
        
        return false;
    }
}