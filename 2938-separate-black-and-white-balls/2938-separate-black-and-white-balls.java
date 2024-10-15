class Solution {
    public long minimumSteps(String s) {
        long cnt=0;
        int j=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                cnt+=(i-j);
                j++;
            }
        }
        return cnt;
    }
}

// class Solution {
//     public long minimumSteps(String s) {
//         long swap = 0;
//         int black = 0; 
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '0') 
//                 swap += (long) black; 
//             else
//                 black++; 
//         }
//         return swap;
//     }
// }