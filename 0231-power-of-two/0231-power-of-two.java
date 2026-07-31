class Solution {
    public boolean isPowerOfTwo(int n) {
        return pow(n,0);
    }
    public boolean pow(int n,int i){
        long x=(long)Math.pow(2,i);
        if(x==n){
            return true;
        }
        else if(x>n){
            return false;
        }
       return pow(n,i+1);
    }
}