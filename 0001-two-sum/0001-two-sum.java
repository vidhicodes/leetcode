class Solution {
    public int[] twoSum(int[] nums, int tgt) {
        int[] ans = {0,0};

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){

                if(i!=j){
                    if(nums[i]+nums[j]==tgt){
                        ans[0]=i;
                        ans[1]=j;                        
                    }
                }

            }

        }

        return ans;

    }
}