class Solution {
    public int minChanges(String s) {
        boolean check=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(0)){
                check=false;
                break;
            }
        }
        if(check){
            return 0;
        }
        
        int ans=0;
        int i=0;
        while(i<s.length()-1){
            if(s.charAt(i)!=s.charAt(i+1)){
                ans++;
            }
            i+=2;
        }
        return ans;
    }
}