class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int s=nums[0];
        int e=nums[nums.length-1];
        int i=1;
        int j=1;
        while(i<nums.length){
            if(nums[i]==s+j){
                i++;
                j++;
            }
            else{
                ans.add(s+j);
                j++;
            }
        }
        return ans;
    }
}