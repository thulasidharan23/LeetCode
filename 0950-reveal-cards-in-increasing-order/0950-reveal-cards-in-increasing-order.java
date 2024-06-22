class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        for(int i=0;i<deck.length/2;i++){
            int temp=deck[i];
            deck[i]=deck[deck.length-i-1];
            deck[deck.length-i-1]=temp;
        }
        List<Integer>arr=new ArrayList<>();
        for(int i=0;i<deck.length;i++){
            arr.add(0,deck[i]);
            if(arr.size()>=2){
                int temp=arr.get(arr.size()-1);
                arr.remove(arr.size()-1);
                arr.add(1,temp);
            }
        }
        int ans[]=new int[arr.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}