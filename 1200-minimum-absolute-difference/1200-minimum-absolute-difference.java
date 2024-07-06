class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>lt=new ArrayList<>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
                int abs=Math.abs(arr[i]-arr[i+1]);
                if(abs==min){
                    lt.add(new ArrayList<>());
                    lt.get(lt.size()-1).add(arr[i]);
                    lt.get(lt.size()-1).add(arr[i+1]);
                }
                else if(abs<min){
                    min=abs;
                    lt.clear();
                    lt.add(new ArrayList<>());
                    lt.get(lt.size()-1).add(arr[i]);
                    lt.get(lt.size()-1).add(arr[i+1]);
                }
            }
        return lt;
    }
}