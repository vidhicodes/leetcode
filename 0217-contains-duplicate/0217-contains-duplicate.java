class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<nums.length;i++){
            if(hm.getOrDefault(nums[i],0)>1){
                flag=true;
                break;
            }
        }

        return flag;
        
    }
}