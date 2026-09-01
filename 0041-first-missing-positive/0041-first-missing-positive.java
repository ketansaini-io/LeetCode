class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean isone=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                isone=true;
                break;
            }
        }
        if(!isone){
            return 1;
        }

        int i=0;
        while(i<nums.length){
            if(nums[i]<1||nums[i]>nums.length){
                i++;
            }
            else{
                int ci=nums[i]-1;
                if(nums[i]!=nums[ci]){
                    int temp=nums[i];
                    nums[i]=nums[ci];
                    nums[ci]=temp;
                }
                else{
                    i++;
                }
            }
        }
        for( i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
}