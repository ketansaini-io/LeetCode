class Solution {
    public int removeDuplicates(int[] nums) {
       int [] ans= new int[nums.length];
       int i=0;
       int j=0;
       while(i<nums.length){
        if(i<nums.length-1&&nums[i]==nums[i+1]){
            ans[j]=nums[i];
            while(i<nums.length-1&&nums[i]==nums[i+1]){
                i++;
            }
        }
        else{
            ans[j]=nums[i];
        }
        i++;
        j++;
       } 
       for(i=0;i<nums.length;i++){
        nums[i]=ans[i];
       }
       return j;
    }
}