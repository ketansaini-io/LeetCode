class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return cs(candidates,target,new ArrayList<>(),new ArrayList<>(),0,0);
    }
    public List<List<Integer>> cs(int[] candidates,int target,List<Integer> temp,List<List<Integer>> ans,int sum,int min){
        if(sum==target){
            List<Integer> t= new ArrayList<>(temp);
            ans.add(t);
        }
        if(sum>target){
            return new ArrayList<>();
        }
        for(int i=min;i<candidates.length;i++){
            temp.add(candidates[i]);
            cs(candidates,target,temp,ans,sum+candidates[i],i);
            temp.remove(temp.size()-1);
        }
        return ans;
    }
}