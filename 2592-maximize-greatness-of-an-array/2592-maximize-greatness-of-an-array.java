class Solution {
    public int maximizeGreatness(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
       int[] compare= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            compare[i]=nums[i];
        }
       
        int i=0;
        int j=0;
        while(i<compare.length&&j<nums.length){
            if(compare[j]>nums[i]){
                i++;
                j++;
                ans++;
            }
            else{
                j++;
            }
        }
      return ans;
    }
}