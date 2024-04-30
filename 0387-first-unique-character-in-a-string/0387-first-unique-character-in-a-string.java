class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==1){
            return 0;
        }
        char c=s.charAt(1);
        for(int i=0;i<s.length();i++){
            int flag=0;
            if(s.charAt(i)!=c){
                for(int j=0;j<s.length();j++){
                    if(i!=j && s.charAt(i)==s.charAt(j)){
                        c=s.charAt(i);
                        flag=1;
                        break;
                    }
                }
            if(flag!=1){
                return i;
            }
        }
    }
        
        return -1;
    }
}