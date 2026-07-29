class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[]= new int[k];
        if(nums.length==1){
            arr[0]=nums[0];
            return arr;
        }
        List<Integer> ans= new ArrayList<>();
        Arrays.sort(nums);
        int l=nums[0];
        ans.add(nums[0]);
        int s=1;
        int j=0;
        for( j=1;j<nums.length;j++){
             if(nums[j]==l){
                s++;
             }
             else{
                l=nums[j];
                ans.add(s);
                ans.add(nums[j]);
                s=1;
             }
        }
        ans.add(s);
        s=0;
        while(s<k){
            int max=0;
            int maxi=1;
            int i=1;
            while(i<ans.size()){
                if(ans.get(i)>max){
                    max=ans.get(i);
                    maxi=i;
                }
                i=i+2;
            }
            arr[s]=ans.get(maxi-1);
            ans.set(maxi,0);
            s++;
        }
        return arr;
    }
}