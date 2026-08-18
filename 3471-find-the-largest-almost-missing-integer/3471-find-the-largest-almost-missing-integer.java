class Solution {
    public int largestInteger(int[] nums, int k) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==k){
            return  Arrays.stream(nums).max().getAsInt();
        }
 if(k==1){
     List<Integer> ans= new ArrayList<>();
     Arrays.sort(nums);
     int j=0;
     int i=0;
     int temp=0;
     while(i<nums.length){
       if(nums[i]==nums[j]){
        temp++;
        i++;
       }
       else{
        if(temp==1){
            ans.add(nums[j]);
        }
        temp=0;
        j=i;
       }
     }
     if(nums[nums.length-1]!=nums[nums.length-2]){
        ans.add(nums[nums.length-1]);
     }
     if(ans.isEmpty()){
        return -1;
     }
     else{
        return Collections.max(ans);
     }
 }
        boolean fo=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[0]){
                fo=true;
                break;
            }
        }
        boolean lo=false;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]==nums[nums.length-1]){
                System.out.println("pass2");
                lo=true;
                break;
            }
        }
        if(fo==false&&lo==false){
            return Math.max(nums[0],nums[nums.length-1]);
        }
        else if(fo==false&&lo==true){
            return nums[0];
        }
        else if(fo==true&&lo==false){
            return nums[nums.length-1];
        }
        else{
            return -1;
        }
    }
}