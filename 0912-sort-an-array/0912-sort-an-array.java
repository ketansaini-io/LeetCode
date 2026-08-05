class Solution {
    public int[] sortArray(int[] nums) {
        return mergesort(nums);

    }
    public int [] mergesort(int[] nums){
        if(nums.length==1){
            return nums;
        }
        int mid=nums.length/2;
        int[] left=Arrays.copyOfRange(nums,0,mid);
        int[] right=Arrays.copyOfRange(nums,mid,nums.length);
        return sort(mergesort(left),mergesort(right));
    }
    public int[] sort(int[] left,int [] right){
        int []ans=new int[left.length+right.length];
        int i=0;
        int j=0;
        while(i<left.length&&j<right.length){
            if(left[i]>right[j]){
                ans[i+j]=right[j];
                j++;
            }
            else{
                ans[i+j]=left[i];
                i++;
            }
        } 
        if(i>=left.length){
            while(j<right.length){
                ans[i+j]=right[j];
                j++;
            }
        }
        else if(j>=right.length){
            while(i<left.length){
                ans[i+j]=left[i];
                i++;
            }
        }
        return ans;
    }
}