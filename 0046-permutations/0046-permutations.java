class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        perm(list,new ArrayList<>(),nums,0);
        return list;
    }
    public void perm(List<List<Integer>> ans,List<Integer> temp,int[] nums,int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int j=0;j<i+1;j++){
                temp.add(j,nums[i]);
            
            perm( ans, temp, nums,i+1);
            temp.remove(j);

        }
    }
}