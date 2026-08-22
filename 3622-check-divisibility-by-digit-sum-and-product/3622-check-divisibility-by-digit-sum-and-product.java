class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int x=n;
        while(x>=1){
            int d=x%10;
            sum+=d;
            mul*=d;
            x=x/10;
        }
        if(n%(sum+mul)==0){
            return true;
        }
        return false;
    }
}