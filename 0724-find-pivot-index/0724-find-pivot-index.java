class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int pivot=0;
        int left=0;
        int right=0;
        int i=-1;
        int j=1;
        while(j<nums.length){
          right+=nums[j];
          j++;
        }
        j=1;
        if(right==left){
            return pivot;
        }
        while(left!=right&&j<nums.length){
            i++;
            left+=nums[i];
            pivot++;
            right-=nums[j];
            j++;
        }
        if(left!=right){
            return -1;
        }
        else{
            return pivot;
        }
    }
}