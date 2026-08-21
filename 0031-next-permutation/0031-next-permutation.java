class Solution {
    public void nextPermutation(int[] nums) {
        
        
        
        int i=nums.length-1;
        while(i>=1){
             if(nums[i]<=nums[i-1]){
                i--;
             }
             else {
               
                    int j=nums.length-1;
                    while(nums[i-1]>=nums[j]){
                        j--;
                    }
                    ex(nums,i-1,j);
                    int x=0;
                    for(int k=i;k<=(i+nums.length-1)/2;k++ ){
                        ex(nums,k,nums.length-1-x);
                        x++;
                    }
                    return;
                }
                
             }
             Arrays.sort(nums);
             return;
        }
    
    public void ex(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}