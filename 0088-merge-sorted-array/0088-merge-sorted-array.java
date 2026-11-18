class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[s];
            s++;
        }
        s=nums1.length-1;
        while(s>0){
            for(int i=0;i<s;i++){
                if(nums1[i]>nums1[i+1]){
                    int temp=nums1[i];
                    nums1[i]=nums1[i+1];
                    nums1[i+1]=temp;
                }
            }
            s--;
        }
        
    
    }
}