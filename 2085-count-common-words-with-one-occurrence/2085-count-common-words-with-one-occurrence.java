class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer>map=new HashMap<>();
        HashMap<String,Integer>map2=new HashMap<>();
        int count=0;
        for(int i=0;i<words1.length;i++){
            if(map.containsKey(words1[i])){
                map.put(words1[i],map.get(words1[i])+1);
            }
            else{
                map.put(words1[i],1);
            }
        }

        for(int i=0;i<words2.length;i++){
            if(map2.containsKey(words2[i])){
                map2.put(words2[i],map2.get(words2[i])+1);
            }
            else{
                map2.put(words2[i],1);
            }
        }

        for(String a:map.keySet()){
            if(map2.containsKey(a) && map.get(a)==1 && map2.get(a)==1){
                count++;
            }
        }
        return count;
    }
}