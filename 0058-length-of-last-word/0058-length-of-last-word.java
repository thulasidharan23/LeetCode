class Solution {
    public int lengthOfLastWord(String s) {
        String c[]=s.split(" ");//Split the group of string to array
        int max=0;
        for(String big:c){
            //to count largest string length:to find largest string(big.length()>max){}
            max=big.length();
        }
        return max;
    }
}