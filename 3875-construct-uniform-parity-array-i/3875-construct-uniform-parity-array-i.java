class Solution {
    public boolean uniformArray(int[] nums1) {
        int i=0;
        boolean odd=true;
        while(i<nums1.length&&odd==true){
            if(nums1[i]%2!=0){
                i++;
            }
            else{
                odd=false;
                for(int j=0;j<nums1.length;j++){
                    if(i==j){
                        continue;
                    }
                    else if( (nums1[i]-nums1[j])%2!=0 ){
                        odd=true;
                        break;
                    }
                }
                i++;
            }
        }
        if(odd==true){
            return true;
        }

         i=0;
        boolean even=true;
        while(i<nums1.length&&even==true){
            if(nums1[i]%2==0){
                i++;
            }
            else{
                even=false;
                for(int j=0;j<nums1.length;j++){
                    if(i==j){
                        continue;
                    }
                    else if( (nums1[i]-nums1[j])%2==0 ){
                        even=true;
                        break;
                    }
                }
                i++;
            }
        }
        if(even==true){
            return true;
        }
        return false;

    }
}