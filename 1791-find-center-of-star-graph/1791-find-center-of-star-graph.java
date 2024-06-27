class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            for(int j=0;j<edges[0].length;j++){
                if(hm.containsKey(edges[i][j])){
                    hm.put(edges[i][j],hm.get(edges[i][j])+1);
                }
                else{
                    hm.put(edges[i][j],1);
                }
            }
        }
        int ans=0;
        for(Map.Entry<Integer,Integer>map:hm.entrySet()){
            if(map.getValue()>=edges.length){
                ans=map.getKey();
            }
        }
        return ans;
    }
}