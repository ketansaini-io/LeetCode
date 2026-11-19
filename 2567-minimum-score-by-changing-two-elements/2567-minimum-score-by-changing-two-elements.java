class Solution {
    public int minimizeSum(int[] nums) {
        if(nums.length==3){
            return 0;
        }
        Arrays.sort(nums);
       int ans= Math.min(nums[nums.length-1] -nums[2],nums[nums.length-3]-nums[0]);
        ans=Math.min(ans,nums[nums.length-2]-nums[1]);
        return ans;
    }
}