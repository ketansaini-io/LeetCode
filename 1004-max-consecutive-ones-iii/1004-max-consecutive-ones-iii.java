class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int one=0;
        int zero=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]==0){
                zero++;
            }
            if(nums[j]==1){
                one++;
            }
            if(zero>k){
                i++;
                if(nums[i-1]==0){
                    zero--;
                }
                else{
                    one--;
                }
            }
            if(zero<=k&&j-i+1>ans){
                ans=j-i+1;
            }
            j++;
        }
        return ans;
    }
}