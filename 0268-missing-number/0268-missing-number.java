class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<=nums.length;i++){
            if(!isIn(nums,i)){
                ans=i;
                break;
            }
        }
        return ans;

        
    }

    public boolean isIn(int[] nums,int n){
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n){
                flag= true;
                break;
            }
        }
        return flag;
    }
}