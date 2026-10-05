class Solution {
    public int longestPalindrome(String s) {
        int len=0;
        int []arr= new int[26];
        int []arrc= new int[26];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>96){
                arr[s.charAt(i)-'a']++;
            }
            else{
                arrc[s.charAt(i)-'A']++;
            }
        }
        boolean one=false;
        for(int i=0;i<26;i++){
            if(arr[i]%2!=0){
                len++;
                one=true;
                break;
            }
        }
        if(!one){
            for(int i=0;i<26;i++){
            if(arrc[i]%2!=0){
                len++;
                break;
            }
        }
        }
        for(int i=0;i<26;i++){
            if(arr[i]>1&&arr[i]%2==0){
                len+=arr[i];
            }
            else if(arr[i]>1&&arr[i]%2!=0){
                len+=arr[i]-1;
            }
        }
        for(int i=0;i<26;i++){
            if(arrc[i]>1&&arrc[i]%2==0){
                len+=arrc[i];
            }
            else if(arrc[i]>1&&arrc[i]%2!=0){
                len+=arrc[i]-1;
            }
        }
        return len;
    }
}