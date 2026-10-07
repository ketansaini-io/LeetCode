class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int l=nums[0];
        int i=1;
        int j=1;
        while(i<nums.length){
            if(nums[i]==l+j){
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
