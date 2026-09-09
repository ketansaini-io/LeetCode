class Solution {
    public long countCommas(long n) {
        if(n<=999){
            return 0;
        }
        long x=1000L;
        long count=0L;
        int cc=0;
        long p=1L;
        while(x<=n){
            count+=(x-p)*cc;
            cc++;
            x*=1000;
            p*=1000;
        }
        if(x>=n){
            count+=(n-x/1000+1)*cc;

        }
        return count;
    }
}