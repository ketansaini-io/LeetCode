class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int right=-1;
        int left=0;
        int min=Integer.MAX_VALUE;
        while(right<nums.length&&left<nums.length){
            if(right<nums.length-1&&sum<target){
                right++;
                sum+=nums[right];
            }
            else{
                if(sum>=target&&right-left+1<min){
                min=right-left+1;
                }
                left++;
                sum-=nums[left-1];
            }
        }
        if(min==Integer.MAX_VALUE){
            min=0;
        }
        return min;
    }
}