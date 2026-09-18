class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            long product=1L;
            for(int j=i;j<nums.length;j++){
                product*=nums[j];
                if(product<k){
                    ans++;
                }
                if(product>=k){
                    break;
                }
            }
        }
        return ans;
        
        
    }
}