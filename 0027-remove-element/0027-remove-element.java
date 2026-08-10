class Solution {
    public int removeElement(int[] nums, int val) {
        int ans=0;
        int i=0;
        while(i<nums.length-ans){
            if(nums[i]==val){
                shift(nums,i);
                ans++;
            }
            else{
                i++;
            }
        }
        return nums.length-ans;
    }
    public void shift(int[] nums, int s){
        for(int i=s;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
    }
}