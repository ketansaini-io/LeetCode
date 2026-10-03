class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<nums1.length&&j<nums2.length){
           if(nums1[i]==nums2[j]){
            ans.add(nums1[i]);
            i++;
            j++;
           }
           else if(nums1[i]>nums2[j]){
            j++;
           }
           else{
            i++;
           }
        }
       i=0;
       List<Integer> Ans=new ArrayList<>();
       if(ans.size()==0){
        return new int[0];
       }
       Ans.add(ans.get(0));
       while(i<ans.size()){
         if((i<ans.size()-1)&&!ans.get(i).equals(ans.get(i+1))){
            Ans.add(ans.get(i+1));
         }
         i++;
       }
      int []a=new int[Ans.size()];
      i=0;
      while(i<Ans.size()){
        a[i]=Ans.get(i);
        i++;
      }
      return a;
    }
}