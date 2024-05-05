class Solution {
    public boolean halvesAreAlike(String s) {
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2);
        int ac=0,bc=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||
            a.charAt(i)=='o'||a.charAt(i)=='u'||a.charAt(i)=='A'||
            a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U'){
                ac++;
            }
        }
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'
            ||b.charAt(i)=='o'||b.charAt(i)=='u'||b.charAt(i)=='A'
            ||b.charAt(i)=='E'||b.charAt(i)=='I'||b.charAt(i)=='O'||b.charAt(i)=='U'){
                bc++;
            }
        }
        if(ac==bc){
            return true;
        }
        return false;
    }
}