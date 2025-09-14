class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (freq.get(target - current) != null) {
                return new int[] {freq.get(target - current), i};
            }
            freq.put(current, i);
        }
        return null;
    }
}