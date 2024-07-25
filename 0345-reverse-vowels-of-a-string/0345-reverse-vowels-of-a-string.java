class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char ch[]=s.toCharArray();
        while(i<j){
            if(vowel(ch[i]) && vowel(ch[j])){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            else if(!vowel(ch[i]) && vowel(ch[j])){
                i++;
            }
            else{
                j--;
            }
        }
        String str=new String(ch);
        return str;   
    }
    public static boolean vowel(char c){
        
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
}