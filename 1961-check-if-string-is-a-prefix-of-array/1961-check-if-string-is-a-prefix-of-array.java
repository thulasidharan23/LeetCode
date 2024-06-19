class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String str="";
        for(String word:words){
            str+=word;
            if(str.equals(s)){
                return true;
            }
        }
        return false;
    }
}