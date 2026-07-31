class Solution {
    public int hammingWeight(int n) {

       return ans(n,0,n);
    }
    public int ans(int n,int a,int x){
        if(x<1){
        return a;
       }
        if(n%2!=0){
            a++;
        }
       
       return ans(n>>1,a,x/2);
    }
}