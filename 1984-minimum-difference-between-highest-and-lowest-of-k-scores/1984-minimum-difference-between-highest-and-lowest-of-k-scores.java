class Solution 
{
    public int minimumDifference(int[] nums, int k) {
       if(k==1){
        return 0;
        
       }
       Arrays.sort(nums);
       for(int i=0;i<nums.length/2;i++){
        int temp=nums[i];
        nums[i]=nums[nums.length-1-i];
        nums[nums.length-1-i]=temp;
       }
       int min=Integer.MAX_VALUE;
       int i=0;
       int j=k-1;
       while(i<nums.length-k+1){
        int l=j;
        while(l<nums.length){
        if(nums[i]-nums[l]<min){
            min=nums[i]-nums[l];
        }
        l++;
        }
        j++;
        i++;

       }
       return min;
    }
}