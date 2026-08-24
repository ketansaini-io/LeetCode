class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int i=1;
        int cn=nums[0];
        int cnm=Integer.MIN_VALUE;
        int max=cnm;
        int count=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
                cn=nums[i];
            }
            if(max<count){
                max=count;
                cnm=cn;
            }
            i++;
        }
        return cnm;
    }
}