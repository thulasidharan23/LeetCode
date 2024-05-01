class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        List<Integer>arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer>map:hm.entrySet()){
            if(map.getValue()>=2){
                arr.add(map.getKey());
            }
        }
        
        return arr;
    }
}
       


