class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int i = 0;
        int j = 0;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    int arr[] = { i, j };
                    return arr;
                }
            }
        }
        return null;
    }
}