class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int i=0;
        int min=Integer.MAX_VALUE;
        int j=0;
        for(int l=0;l<nums.length;l++){
            if(nums[l]>max){
                max=nums[l];
                i=l;
            }
            if(nums[l]<min){
                min=nums[l];
                j=l;
            }
        }
        int f=Math.min(i,j);
        int l=Math.max(i,j);
        int ans= Math.min(l+1,nums.length-f);
        return Math.min(ans,f+1+nums.length-l);
    }
}