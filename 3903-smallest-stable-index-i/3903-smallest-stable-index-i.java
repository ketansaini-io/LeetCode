class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int []suffixmin=new int[nums.length];
       suffixmin[nums.length-1]=nums[nums.length-1];
       for(int i=nums.length-2;i>=0;i--){
        suffixmin[i]=Math.min(nums[i],suffixmin[i+1]);
       }
        int max=nums[0];
        int is=max-suffixmin[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            is=max-suffixmin[i];
            if(is<=k){
                return i;
            }
            
        }
        return -1;
    }
}