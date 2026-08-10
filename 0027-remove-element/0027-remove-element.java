class Solution {
    public int removeElement(int[] nums, int val) {
        int ans=0;
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
            else{
                ans++;
            }
            i++;
        }
        return nums.length-ans;
    }
   
}