class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
        boolean found=false;
        int i=0;
        while(i<haystack.length()-needle.length()+1){
            int ci=0;
            int len=0;
            for(int j=i;j<i+needle.length();j++ ){
                if(haystack.charAt(j)!=needle.charAt(ci)){
                    break;
                }
                else{
                    len++;
                    ci++;
                }
            }
            if(len==needle.length()){
                return i;
            }
            i++;
        }
        return -1;

    }
}