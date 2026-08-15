class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int k=1;
        for(int i=0;i<nums.length;i++){
            int j=0;
            
            List<List<Integer>> internal=new ArrayList<>();
            while(j<k){
                List<Integer> temp=new ArrayList<>(outer.get(j));
                temp.add(nums[i]);
                internal.add(temp);
                j++;
            }
            k*=2;
            outer.addAll(internal);
        }
        return outer;
    }
}

        