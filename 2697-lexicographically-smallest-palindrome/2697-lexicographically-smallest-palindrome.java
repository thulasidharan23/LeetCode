class Solution {
    public String makeSmallestPalindrome(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length/2;i++){
            if(ch[i]!=ch[n-i-1]){
                if(ch[i]<ch[n-i-1]){
                    ch[n-i-1]=ch[i];
                }
                else{
                    ch[i]=ch[n-i-1];
                }
            }
        }
        String str="";
        for(int i=0;i<ch.length;i++){
            str+=ch[i];
        }
        return str;
        
    }
}