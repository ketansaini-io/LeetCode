class Solution {
    public int numberOfSteps(int num) {
       return  steps(num,0);
    }
    public int steps(int n,int ans){
       if(n<=0){
        return ans;
       }
       if(n%2==0){
        return steps(n/2,ans+1);
       }
        return steps(n-1,ans+1);
    } 
}