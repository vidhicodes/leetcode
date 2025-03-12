class Solution {
    public void moveZeroes(int[] nums) {
        int countzeroes = 0;
        int ans[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countzeroes++;
            }
        }

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ans[j] = nums[i];
                j++;
            }
        }

        for (int i = j; i < nums.length; i++) {
            ans[i] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
    }
}
