class Solution {
    public boolean digitCount(String num) {
        int arr[]=new int[10];
        for(int i=0;i<num.length();i++){
            arr[num.charAt(i)-'0']++;
        }
        for(int i=0;i<num.length();i++){
            if(arr[i]!=num.charAt(i)-'0'){
                return false;
            }
        }
        return true;
    }
}