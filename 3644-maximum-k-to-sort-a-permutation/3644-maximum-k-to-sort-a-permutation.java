class Solution {
    public int sortPermutation(int[] nums) {
        int k=0;
        boolean f=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                if(!f){
                    k=i;
                    f=true;
                }
                k&=i;
            }
        }
        return k;
    }
}