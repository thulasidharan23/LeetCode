class Solution {
    public int repeatedNTimes(int[] nums) {
        int len=nums.length/2;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        int ans=0;
        for(Map.Entry<Integer,Integer>map:hm.entrySet()){
            if(map.getValue()==len){
                ans=map.getKey();
            }
        }
        return ans;
    }
}