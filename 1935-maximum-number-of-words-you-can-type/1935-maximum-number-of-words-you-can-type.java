class Solution {
    public int canBeTypedWords(String t, String b) {
        String str[]=t.split(" ");
        int count=0;
        for(String s:str){
            for(int j=0;j<b.length();j++){
                if(s.indexOf(b.charAt(j))!=-1){
                    count++;
                    break;
                }
            }
        }
        return str.length-count;
    }
}