class Solution {
    public List<String> generateParenthesis(int n) {
        return gp(n,0,0,"",new ArrayList<>());
    }
     public  List<String> gp(int n,int rp,int lp,String s,List<String> ans){
        if(rp==n&&lp==n){
            ans.add(s);
        }
        if(rp==lp&&rp<=n&&lp<=n){
            gp(n,rp,lp+1,s+"(",ans);
        }
       if(rp<lp&&rp<=n&&lp<=n){
        gp(n,rp,lp+1,s+"(",ans);
        gp(n,rp+1,lp,s+")",ans);
       }
       return ans;
    }
}