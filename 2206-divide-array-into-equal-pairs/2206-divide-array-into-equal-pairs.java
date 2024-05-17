class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2!=0){
            return false;
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>map:hm.entrySet()){
            int val=map.getValue();
            if(val%2!=0){
                return false;
            }
        }
        return true;
    }
}