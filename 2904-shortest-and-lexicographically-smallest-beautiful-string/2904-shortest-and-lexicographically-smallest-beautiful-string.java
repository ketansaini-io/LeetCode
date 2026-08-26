class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i=0;
        int j=0;
        int len=0;
        int min=Integer.MAX_VALUE;
        int ri=-1;
        int rj=-1;
        String ans="";
        while(i<s.length()&&j<s.length()){
            if(s.charAt(i)=='1'){
                len++;
            }
            while(len>=k){
                if(s.charAt(j)=='1'){
                    len--;
                    if(len<k){
                    len++;
                    break;
                }
                }
                j++;
            }
            if(len==k&&i-j+1<=min){
                if(i-j+1==min){
                    String temp=s.substring(j,i+1);
                    ans=test(ans,temp);
                }
                else{
                ri=i;
                rj=j;
                min=i-j+1;
                ans=s.substring(rj,ri+1);
                }
            }
            i++;
        }
        if(ri==-1){
            return "";
        }
        return ans;
    }
    public String test(String s1, String s2){
        int i=0;
        while(i<s1.length()){
            if(s1.charAt(i)>s2.charAt(i)){
                return s2;
            }
            else if(s1.charAt(i)<s2.charAt(i)){
                return s1;
            }
            else{
                i++;
            }
        }
        return s1;
    }
}