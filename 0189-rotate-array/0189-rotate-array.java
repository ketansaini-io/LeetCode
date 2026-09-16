class Solution {
    public void rotate(int[] nums, int k) {
        int [] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=i+k;
            while(sum>nums.length-1){
                sum=sum-nums.length;
            }
            ans[sum]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}