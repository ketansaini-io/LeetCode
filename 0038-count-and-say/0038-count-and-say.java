class Solution {
    public String countAndSay(int n) {
        return rec(n,"1",1);
    }
    public String rec(int n,String s,int i){
      if(i==n){
        return s;
      }
      String l="";
      int j=0;
      int p=1;
      while(j<s.length()){
        if(j<s.length()-1&&s.charAt(j)==s.charAt(j+1)){
            p++;
        }
        else{
            l=l+p+s.charAt(j);
            p=1;
        }
        j++;
      }
     return rec(n,l,i+1);
    }
}