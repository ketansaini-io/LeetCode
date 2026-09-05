class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int [] suffixmin=new int[nums.length];
        suffixmin[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<=suffixmin[i+1]){
                suffixmin[i]=nums[i];
            }
            else{
                suffixmin[i]=suffixmin[i+1];
            }
        }
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            int is=max-suffixmin[i];
            if(k>=is){
                return i;
            }
        }
        return -1;
    }
}