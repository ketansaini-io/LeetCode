class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans=new String[m];
     ans[0]="";
     for(int i=0;i<n;i++){
        ans[0]+=".";
     }
    String rest="";
    for(int i=0;i<n-1;i++){
        rest+="#";
     }
     for(int i=1;i<m;i++){
        ans[i]=rest;
     }
     for(int i=1;i<m;i++){
        ans[i]+=".";
     }
     return ans;
    }
}