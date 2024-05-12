class Solution {
    public boolean detectCapitalUse(String word) {
        String lower=word.toLowerCase();
        String upper=word.toUpperCase();
        if(lower.equals(word) || upper.equals(word)){
            return true;
        }
        char ch=word.charAt(0);
        if(Character.isUpperCase(ch)){
            String sub=word.substring(1);
            for(int i=0;i<sub.length();i++){
                if(sub.charAt(i)>='A' ||sub.charAt(i)<='Z'){
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}