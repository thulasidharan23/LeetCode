class Solution {
    public int[] diStringMatch(String s) {
        int arr[]=new int[s.length()+1];
        int count=0,d=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='D'){
                arr[i]=d--;
            }
            else{
                arr[i]=count;
                count++;
            }
        }
        arr[s.length()]=count;
        return arr;
    }
}