class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxfre=Integer.MIN_VALUE;
        int r=nums.length-1;
        int l=r-1;
        int sum=0;
        int fr=1;
        if(nums.length==1){
            return 1;
        }
    
        while(l>=0){
          sum+=nums[l];
          if(sum+k>=nums[r]*(r-l)){
            fr++;
          }
          else{
            r--;
         sum-=nums[r];
          }
          if(fr>maxfre){
            maxfre=fr;
          }
          l--;
        } 
        if(maxfre==0){
            maxfre++;
        }
        return maxfre;
    }
}