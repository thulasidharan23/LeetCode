class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0];  
        Set<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : set) {
            rankMap.put(num, rank++);
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = rankMap.get(arr[i]);
        }
        return ans;
    }
}
