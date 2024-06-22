class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        List<Integer>hs=new ArrayList<>();
        for(Map.Entry<Integer,Integer>map:hm.entrySet()){
            hs.add(map.getValue());
        }
        Collections.sort(hs);
        int freq=hs.get(hs.size()-1);
        int cnt=0;
        for(Map.Entry<Integer,Integer>map:hm.entrySet()){
            if(map.getValue()==freq){
                cnt++;
            }
        }
    return cnt*freq;
    }
}