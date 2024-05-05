class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer>arr=new ArrayList<>();
        for(int i=0;i<stones.length;i++){
            arr.add(stones[i]);
        }
        
        while(arr.size()>1){
            Collections.sort(arr);
        
        
        if(arr.get(arr.size()-1)==arr.get(arr.size()-2)){
            arr.remove(arr.size()-1);
        }
        else{
            arr.set(arr.size()-2,arr.get(arr.size()-1)-arr.get(arr.size()-2));
        }
        arr.remove(arr.size()-1);
        }
    return arr.size()==1?arr.get(0):0;
    }
}