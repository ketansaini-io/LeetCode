class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        long i=1;
        while(i<=n){
            if(i==n){
                return true;
            }
            i=i*3;
        }
        return false;
    }
}