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
    public void shift(int[] nums, int s){
        for(int i=s;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
    }
}