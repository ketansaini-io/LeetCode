class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=k-1;
        int sum=0;
        for(int l=0;l<=j;l++){
            sum+=nums[l];
        }
        double avg=(double)sum/k;
        while(j<nums.length){
           if((double)sum/k>avg){
            avg=(double)sum/k;
           }
           j++;
           i++;
           if(j<nums.length){
           sum+=nums[j];
           sum-=nums[i-1];
           }
        }
        return avg;
    }
}