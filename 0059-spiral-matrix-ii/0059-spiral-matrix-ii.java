class Solution {
    public int[][] generateMatrix(int n) {
        int [][]ans= new int[n][n];
        boolean row=false;
        boolean col=true;
        int dirr=1;
        int dirc=1;
        int r=0;
        int c=0;
        ans[0][0]=1;
        int i=2;
        int ra=0;
        int ca=n;
        int raf=-2;
        int caf=-2;
        while(i<=n*n){
            if(row){
             if(r+dirr>=n||r+dirr==raf||r+dirr<0){
                row=false;
                col=true;
                raf=ra;
                c=c+dirc;
                dirr=dirr*(-1);
                ra=r;
             }
             else{
                r=r+dirr;
             }
            }
            else{
             if(c+dirc>=n||c+dirc==caf||c+dirc<0){
                row=true;
                col=false;
                caf=ca;
                r=r+dirr;
                dirc=dirc*(-1);
                ca=c;
             }
             else{
                c=c+dirc;
             }
            }
             ans[r][c]=i;
             i++;
        }
        return ans;
    }
}