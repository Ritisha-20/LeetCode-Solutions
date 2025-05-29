class Solution {
    public int firstMissingPositive(int[] nums) {

        boolean flag[] = new boolean[nums.length];
        int len = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] < len + 1)
                flag[nums[i] - 1] = true;
        }

        for (int i = 0; i < len; i++) {
            if (!flag[i])
                return i + 1;   
        }
        return len + 1;
    }
}