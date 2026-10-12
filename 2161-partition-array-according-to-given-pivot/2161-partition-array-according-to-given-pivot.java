class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
      int[] ans=new int[nums.length];
      int p=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]<pivot){
            ans[p]=nums[i];
            p++;
        }
      } 
      for(int i=0;i<nums.length;i++){
        if(nums[i]==pivot){
            ans[p]=nums[i];
            p++;
        }
      } 
      for(int i=0;i<nums.length;i++){
        if(nums[i]>pivot){
            ans[p]=nums[i];
            p++;
        }
      } 
      for(int i=0;i<nums.length;i++){
        nums[i]=ans[i];
      } 
      return nums;
    }
}