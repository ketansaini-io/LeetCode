class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return ans(nums,target,0,0);
    }
    public int ans(int[] nums,int target, int sum,int min){
        if(min==nums.length){
        if(sum==target){
            return 1;
        }
        else{
            return 0;
        }
        }
        int total=ans(nums,target,sum+nums[min],min+1)+ans(nums,target,sum-nums[min],min+1);
        
        return total;
    }
}