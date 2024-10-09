class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int len=s.length();
        int r=0,l=0;
        int ans=0;
        while(r<len){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                l=Math.max(l,map.get(ch)+1);
            }
            map.put(ch,r);
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}