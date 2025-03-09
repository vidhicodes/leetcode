class Solution {
    public int singleNumber(int[] nums) {
        int c=0;
        int ans=0;
        Map<Integer,Integer> sn= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sn.put(nums[i],sn.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            c=sn.getOrDefault(nums[i],0);
            if(c==1){
               ans= nums[i];
               break;
            }
        }

        return ans;
        
    }
}