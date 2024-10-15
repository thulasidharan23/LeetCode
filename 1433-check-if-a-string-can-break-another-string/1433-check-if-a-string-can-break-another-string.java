class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char s[]=s1.toCharArray();
        char t[]=s2.toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);
        if(s1.length()!=s2.length()){
            return false;
        }
        boolean ans=check(s,t)||check(t,s);
        return ans;
    }
    static boolean check(char[] s,char[] t){
        for(int i=0;i<s.length;i++){
            if(s[i]>t[i]){
                return false;
            }
        }
        return true;
    }
}