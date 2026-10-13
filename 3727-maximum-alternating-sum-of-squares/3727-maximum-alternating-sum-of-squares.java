class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)
            nums[i]*=-1;
        }
        Arrays.sort(nums);
        long ans=0;
        int[] arr= new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int p=0;
        while(p<nums.length){
            arr[p]=nums[j];
            if(p+1<nums.length)
            arr[p+1]=nums[i];
            p+=2;
            i++;
            j--;
        }
        int l=1;
        for(i=0;i<nums.length;i++){
            ans+=arr[i]*arr[i]*l;
            l*=-1;
        }
        return ans;
    }
}