class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int max=nums[0];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int is=max-min;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            is=max-min;
            if(is<=k){
                return i;
            }
            if(min==nums[i]&&i<nums.length-1){
                min=nums[i+1];
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]<min){
                        min=nums[j];
                    }
                }
            }
        }
        return -1;
    }
}