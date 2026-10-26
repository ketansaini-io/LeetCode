class Solution {
    public int[] concatWithReverse(int[] nums) {
       List<Integer> ans=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        ans.add(nums[i]);
       } 
       for(int i=nums.length-1;i>=0;i--){
        ans.add(nums[i]);
       } 
       return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}