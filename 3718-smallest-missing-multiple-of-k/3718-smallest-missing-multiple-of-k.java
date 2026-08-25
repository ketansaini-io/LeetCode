class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int mul=k;
        int j=2;
        int l=0;
        while(l<nums.length){
            if(nums[l]==mul){
                mul=k*j;
                j++;
            }
            else if(nums[l]<mul){
                l++;
            }
            else{
                return mul;
            }
        }
        return mul;
    }
}