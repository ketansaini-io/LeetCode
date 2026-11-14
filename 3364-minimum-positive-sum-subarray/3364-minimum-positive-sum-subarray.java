class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
       int max=0;
       int[]arr=new int[nums.size()];
       for(int i=0;i<arr.length;i++){
        arr[i]=nums.get(i);
       }
       for(int i=l-1;i<r;i++){
        int sum=0;
        int j=0;
        int p=i;
        for(j=0;j<=p;j++){
            sum+=arr[j];
        }

        if(max==0){
            if(sum>max){
                max=sum;
            }
            
        }
        else{
            if(sum<max&&sum>0){
                max=sum;
            }
        }
        j=0;
        p++;
        while(p<arr.length){
            sum+=arr[p];
            sum-=arr[j];
            if(max==0&&sum>max){
                max=sum;
            }
            if(sum<max&&sum>0){
                max=sum;
            }
            j++;
            p++;
        }
       } 
       if(max==0){
        return -1;
       }
       return max;
    }
}