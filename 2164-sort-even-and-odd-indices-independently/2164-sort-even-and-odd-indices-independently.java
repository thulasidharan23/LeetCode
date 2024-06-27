class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] ans = new int[nums.length];
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        for (int i = 0, ev = 0, od = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ans[i] = even.get(ev++);
            } else {
                ans[i] = odd.get(od++);
            }
        }
        return ans;
    }
}